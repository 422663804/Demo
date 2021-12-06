package com.tian.demo02.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            connection = JdbcUtils.getConnection(); //获取数据库链接
            statement = connection.createStatement(); //获取数据库对象
//            connection.prepareStatement()
            String sql = "INSERT INTO `user` (id,`username`,`password`) VALUES(2,'123','123a')";
            int i = statement.executeUpdate(sql);
            if (i > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection, statement, null);
        }
    }
}

