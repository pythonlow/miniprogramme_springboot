package com.example.miniprogramme_springboot.recommend;


import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

//@Select({
//        "select u_id,b_id,rating from rating"
//}
//)
//@Results(id = "rating",value={
//        @Result(property = "u_id",column = "uid"),
//        @Result(property = "b_id",column = "bid"),
//        @Result(property = "rating",column = "rating")
//})

public class ExtractData {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/finaltest?serverTimezone=UTC";
        String username = "root";
        String password = "sql2008";

        String csvFilePath = "src/main/resources/dataset/rating.csv";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            String sql = "SELECT u_id,b_id,rating FROM rating";

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvFilePath));
            // write header line containing column names
//            fileWriter.write("uid,bid,rating");
            while (result.next()) {
                String uid = result.getString("u_id");
                String bid = result.getString("b_id");
                Integer rating = result.getInt("rating");
                String line = String.format("%s,%s,%s",
                        uid, bid, rating);
                fileWriter.newLine();
                fileWriter.write(line);
            }
            statement.close();
            fileWriter.close();
        } catch (SQLException e) {
            System.out.println("Database error:");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File IO error:");
            e.printStackTrace();
        }

    }

}
