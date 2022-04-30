package com.example.miniprogramme_springboot.recommend;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class ExtractData_1 {
    public void extractdata(){
        String jdbcURL = "jdbc:mysql://localhost:3306/finaltest?serverTimezone=UTC";
        String username = "root";
        String password = "sql2008";
        String csvFilePath = "src/main/resources/dataset/rating.csv";
        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            String sql = "SELECT u_id,b_id,rating FROM rating";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvFilePath));
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
