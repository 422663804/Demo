package com.tian.demo03.utils;

import com.tian.demo02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDBCP {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //区别 使用? 占位符代替参数
            connection = JdbcUtils_DBCP.getConnection();
            String sql = "update `user` set `password`=? where id =?";
            preparedStatement = connection.prepareStatement(sql); //预编译SQL，先写sql 然后不执行

            //手动给参数参数赋值
            preparedStatement.setString(1, "newPassword5");
            preparedStatement.setInt(2, 1);
            //执行
            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("更新成功");
            } else {
                System.out.println("更新失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils_DBCP.release(connection, preparedStatement, null);
        }
    }
}
