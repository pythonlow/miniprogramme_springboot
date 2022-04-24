package com.example.miniprogramme_springboot.recommend;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;


import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class Split {
    Similarity sim=new Similarity();
    //体现出分词效果
    public void splitWord(String s) throws IOException {
        String text = s;
        Analyzer analyzer = new IKAnalyzer(true);// 构造函数当为 true时，分词器采用智能切分
        StringReader reader = new StringReader(text);
        TokenStream ts = analyzer.tokenStream("", reader);
        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class);
        while(ts.incrementToken()){
            if(!sim.delUseless(term.toString())){
                System.out.print(term.toString() + "|");
            }
        }
        System.out.println();
        analyzer.close();
        reader.close();
    }
    //将分词结果存到数组中去,在这里面处理掉无用词
    public ArrayList<String> splitWordtoArr(String s) throws IOException {
        String text = s;
        ArrayList List = new ArrayList();
        Analyzer analyzer = new IKAnalyzer(true);// 构造函数当为 true时,分词器采用智能切分
        StringReader reader = new StringReader(text);
        TokenStream ts = analyzer.tokenStream("", reader);
        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class);
        while(ts.incrementToken()){
            if(!sim.delUseless(term.toString())){
                List.add(term.toString());
            }
        }
        analyzer.close();
        reader.close();
        return List;
    }
}
