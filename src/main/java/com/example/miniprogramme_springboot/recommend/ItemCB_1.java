package com.example.miniprogramme_springboot.recommend;

import java.io.IOException;
import java.sql.*;
import java.util.*;

public class ItemCB_1 {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/finaltest?serverTimezone=UTC";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "sql2008";
    public  Map<Integer, Double> getItemCB(int[] bid){
        Split sw=new Split();
        Similarity sim=new Similarity();
        //初始化jdbc
        Connection conn = null;
        Statement stmt = null;
        Map<Integer,Double> simList = new HashMap<>();
//        Map<Integer,Double> sortedMap = new HashMap<>() ;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties props = new Properties();
            props.setProperty("characterEncoding", "utf-8");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;

            for(int i =0;i<bid.length;i++){
                for(int j=1;j<20;j++) {
                    if(j==bid[i])continue;
                    sql = "SELECT `title`,`author`,`translator`,`publisher`,`comment`,`type`,`tag` FROM `books` WHERE `id`=" + j + " OR `id`=" + bid[i];
//                    System.out.println(sql);
                    ResultSet rs = stmt.executeQuery(sql);
                    ArrayList[] result = new ArrayList[2];//暂存每条数据分词后的结果，用于传入计算类似度

                    int k = 0;
                    while (rs.next()) {
                        String type = (rs.getString("type") != null) ? rs.getString("type") : " ";
                        String title = (rs.getString("title") != null) ? rs.getString("title") : " ";
                        String author = (rs.getString("author") != null) ? rs.getString("author") : " ";
                        String publisher = rs.getString("publisher") != null ? rs.getString("publisher") : " ";
                        String comment = rs.getString("comment") != null ? rs.getString("comment") : " ";
                        String translator = rs.getString("translator") != null ? rs.getString("translator") : " ";
                        String handle = rs.getString("tag").concat(comment).concat(author).concat(translator).concat(title).concat(publisher).concat(type);
                        sw.splitWord(handle);
                        result[k] = sw.splitWordtoArr(handle);
                        k++;

                    }
//                    ArrayList[] simresult = new ArrayList[7];//暂存每条数据相似度
//                    simresult[k].add(bid[i]+j+sim.getSimilarDegree(result[0],result[1]));
                    simList.put(j,sim.getSimilarDegree(result[0],result[1]));
//                    System.out.println(simList);

//                    simList.entrySet().stream().sorted(Comparator.comparing(e->e.getValue())).forEach(System.out::println);
//

                    rs.close();
                }
            }

            Map<Integer,Double> sortMap =sortMap(simList);
//            System.out.println(sortMap);//计算类似度
            Map<Integer,Double>sortedMap =subMap(sortMap,10);
//            System.out.println(sortedMap);

            stmt.close();

            conn.close();
            return sortedMap;
        }
        catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }


        return null;
    };

    public static Map<Integer, Double> sortMap(Map<Integer, Double> map) {
//        //利用Map的entrySet方法，转化为list进行排序
//        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(map.entrySet());
//        //利用Collections的sort方法对list排序
//        entryList.sort((o1, o2) -> {
//            //正序排列，倒序反过来
//            return (int) (o1.getValue() - o2.getValue());
//        });
//        //遍历排序好的list，一定要放进LinkedHashMap，因为只有LinkedHashMap是根据插入顺序进行存储
//        LinkedHashMap<Integer, Double> linkedHashMap = new LinkedHashMap<>();
//        for (Map.Entry<Integer,Double> e : entryList
//        ) {
//            linkedHashMap.put(e.getKey(),e.getValue());
//        }
//        return linkedHashMap;
        LinkedHashMap sortMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).forEach(entry -> sortMap.put(entry.getKey(), entry.getValue()));
        return  sortMap;
    }

    public Map<Integer, Double> subMap(Map<Integer, Double> map, int length) {
        List<Map.Entry<Integer, Double>> lists = new ArrayList<>(map.entrySet());
        LinkedHashMap<Integer, Double> sortedMap = new LinkedHashMap<>();
        if (lists.size() >= length) {
            for (Map.Entry<Integer, Double> set : lists.subList(0, length)) {
                sortedMap.put(set.getKey(), set.getValue());
            }
        } else {
            for (Map.Entry<Integer, Double> set : lists) {
                sortedMap.put(set.getKey(), set.getValue());
            }
        }
        return sortedMap;
    }


//    public static void main(String[] args){
//        int [] arr =new int[10];
//        for(int i=0;i<5;i++){
//            arr[i]=i+10;
//        }
//        getItemCB(arr);
//    }
}
