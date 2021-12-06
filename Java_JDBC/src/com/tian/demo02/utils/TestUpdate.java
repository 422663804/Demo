package com.tian.demo02.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();
            String sql = "UPDATE `user` SET password='43210' WHERE id = 3";
            int i = statement.executeUpdate(sql);
            if (i > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(connection, statement, null);
        }
    }
}
