package com.tian.demo02.demo02;

import com.tian.demo02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 通过SQL注入方式 插入数据
 */

public class prepareStatementTestInsert {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //区别 使用? 占位符代替参数
            connection = JdbcUtils.getConnection();
            String sql = "insert into `user` (id,`username`,`password`) values (?,?,?)";
            preparedStatement = connection.prepareStatement(sql); //预编译SQL，先写sql 然后不执行

            //手动给参数参数赋值
            preparedStatement.setInt(1, 5);
            preparedStatement.setString(2, "789");
            preparedStatement.setString(3, "987");
            //执行
            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection, preparedStatement, null);
        }
    }
}
