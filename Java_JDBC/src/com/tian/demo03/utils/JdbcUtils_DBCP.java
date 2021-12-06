package com.tian.demo03.utils;

import com.tian.demo02.utils.JdbcUtils;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils_DBCP {
    private static  DataSource dataSource = null;

    static {
        try {
            InputStream resourceAsStream = JdbcUtils.class.getClassLoader().getResourceAsStream("dbcp.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            //创建数据源 工厂模式-->创建
            dataSource = BasicDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    2、获取链接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection(); //从数据源中获取链接
    }

    //    3、释放链接
    public static void release(Connection connection, Statement statement, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
