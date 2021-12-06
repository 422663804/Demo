package com.tian.demo02.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT * FROM `user` WHERE id=2";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getObject("password"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(connection, statement, resultSet);
        }
    }
}
