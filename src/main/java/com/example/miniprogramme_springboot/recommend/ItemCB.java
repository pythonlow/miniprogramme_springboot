package com.example.miniprogramme_springboot.recommend;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class ItemCB {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/finaltest?serverTimezone=UTC";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "sql2008";

    public static void main(String[] args) {
        /*
        新建split对象，而后用jdbc读取数据用splitWrod处理
         */
        Split sw=new Split();
        Similarity sim=new Similarity();

        //初始化jdbc
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //STEP 3: Open a connection

            Properties props = new Properties();
            props.setProperty("characterEncoding", "utf-8");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
//            sql = "SELECT count(*) FROM recipe_copy";

            sql="SELECT `title`,`author`,`translator`,`publisher`,`comment`,`type`,`tag` FROM `books` WHERE `id`=009 OR `id`=010";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            ArrayList[] result=new ArrayList[2];//暂存每条数据分词后的结果，用于传入计算类似度
            ArrayList[] simresult = new ArrayList[7];//暂存每条数据相似度
            int k=0;
            while(rs.next()){
                //Retrieve by column name
                String type = (rs.getString("type")!=null ) ? rs.getString("type") : " ";
                String title = (rs.getString("title")!=null) ? rs.getString("title") : " ";
                String author =(rs.getString("author")!=null)? rs.getString("author"): " " ;
                String publisher=rs.getString("publisher")!=null ? rs.getString("publisher"): " ";
                String comment = rs.getString("comment")!=null ? rs.getString("comment"):" ";
                String translator=rs.getString("translator")!=null ? rs.getString("translator") : " " ;
                String handle = rs.getString("tag").concat(comment).concat(author).concat(translator).concat(title).concat(publisher).concat(type);
                //Display values
//                String handle = rs.getString("author");
                sw.splitWord(handle);
                result[k]=sw.splitWordtoArr(handle);
                k++;
            }
            System.out.println(sim.getSimilarDegree(result[0],result[1]));//计算类似度
//                while(rs.next()){
//                    String author =(rs.getString("author")!=null)? rs.getString("author"): " ";
//                    sw.splitWord(author);
//                    result[k] =sw.splitWordtoArr(author);
//                    k++;
//                    simresult[k]=sim.getSimilarDegree(result[])
//                }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try

    }//end main
}
