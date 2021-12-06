package com.tian.demo01;


import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        1、链接数据库
        Class.forName("com.mysql.cj.jdbc.Driver");
//        2、用户信息和url    useUnicode=true支持中文编码  characterEncoding=utf8编码格式为utf-8  useSSL=true 安全链接
//        3、链接成功，数据库对象 Connection代表数据库
        String url = "jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "Aa0981124240";
        Connection connection = DriverManager.getConnection(url, username, password);
//        4、执行SQL对象
        Statement statement = connection.createStatement();
//        5、执行SQL对象  去执行SQL 可能会返回一个结果
        String sql = "SELECT * FROM user02";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println("id\t"+resultSet.getObject("id"));
            System.out.println("username\t"+resultSet.getObject("username"));
            System.out.println("password\t"+resultSet.getObject("password"));
        }
//        6、释放链接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
