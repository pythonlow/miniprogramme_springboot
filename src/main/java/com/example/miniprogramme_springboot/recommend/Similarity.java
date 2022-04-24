package com.example.miniprogramme_springboot.recommend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Similarity {
    public double getSimilarDegree(ArrayList<String> str1, ArrayList<String> str2)
    {
        //建立向量空间模型，使用map实现，主键为词项，值为长度为2的数组，存放着对应词项在字符串中的出现次数
        Map<String, int[]> vectorSpace = new HashMap<String, int[]>();
        int[] itemCountArray = null;//为了不频繁产生局部变量，因此将itemCountArray声明在此

        //动态数组转为数组

        int size1=str1.size();
        String[] strArray1 = (String[])str1.toArray(new String[size1]);

        for(int i=0; i<strArray1.length; ++i)
        {
            if(vectorSpace.containsKey(strArray1[i]))
                ++(vectorSpace.get(strArray1[i])[0]);
            else
            {
                itemCountArray = new int[2];
                itemCountArray[0] = 1;
                itemCountArray[1] = 0;
                vectorSpace.put(strArray1[i], itemCountArray);
            }
        }
        int size2=str2.size();
        String[] strArray2 = (String[])str2.toArray(new String[size2]);
        for(int i=0; i<strArray2.length; ++i)
        {
            if(vectorSpace.containsKey(strArray2[i]))
                ++(vectorSpace.get(strArray2[i])[1]);
            else
            {
                itemCountArray = new int[2];
                itemCountArray[0] = 0;
                itemCountArray[1] = 1;
                vectorSpace.put(strArray2[i], itemCountArray);
            }
        }

        //计算类似度
        double vector1Modulo = 0.00;//向量1的模
        double vector2Modulo = 0.00;//向量2的模
        double vectorProduct = 0.00; //向量积
        Iterator iter = vectorSpace.entrySet().iterator();

        while(iter.hasNext())
        {
            Map.Entry entry = (Map.Entry)iter.next();
            itemCountArray = (int[])entry.getValue();

            vector1Modulo += itemCountArray[0]*itemCountArray[0];
            vector2Modulo += itemCountArray[1]*itemCountArray[1];

            vectorProduct += itemCountArray[0]*itemCountArray[1];
        }

        vector1Modulo = Math.sqrt(vector1Modulo);
        vector2Modulo = Math.sqrt(vector2Modulo);

        //返回类似度
        return (vectorProduct/(vector1Modulo*vector2Modulo));
    }
    public boolean delUseless(String value){
        Pattern pattern = Pattern.compile("^\\pN");
        Matcher isNum = pattern.matcher(value);
        if(isNum.find()){
            return true;
        }else
            return false;
    }
}
