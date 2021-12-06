package com.tian.demo02.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = JdbcUtils.getConnection();             //          1、获取数据库链接
            statement = connection.createStatement();           //          2、获取sql对象
            String sql = "DELETE FROM `user` WHERE id=4";       //          3 、输入sql链接
            int i = statement.executeUpdate(sql);
            if (i > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection, statement, null);
        }
    }
}
