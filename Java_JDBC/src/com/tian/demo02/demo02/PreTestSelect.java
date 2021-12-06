package com.tian.demo02.demo02;

import com.tian.demo02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreTestSelect {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            String sql = "SELECT * FROM `user` WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("账号\t" + resultSet.getString("username") + "\t密码\t" + resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection, preparedStatement, resultSet);
        }

    }
}
