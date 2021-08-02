package org.cochise;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    private static DruidDataSource dataSource;

    // 方式一：使用传统JDBC连接数据库
    static {
        // 加载驱动
        Driver driver = new org.postgresql.Driver();

        // 设置连接信息
        String url = "jdbc:postgresql://localhost:5432/sln";
        Properties info = new Properties();
        info.setProperty("user","sln");
        info.setProperty("password","planexus");

        // 创建连接
        try {
            Connection connect = driver.connect(url, info);
            System.out.println(connect);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    // 方式二：使用DriverManager连接数据库
    static {
        try {
            // 反射获取驱动
            Class<?> clazz = Class.forName("org.postgresql.Driver");
//            Driver driver = (Driver) clazz.newInstance();
//
//            // 注册驱动（可省略）
//            DriverManager.registerDriver(driver);

            // 获取连接
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sln", "sln", "planexus");
            System.out.println(connection);
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

    // 方式三：使用Druid连接池连接数据库
    static {
//        try {
//            Properties properties = new Properties();
//
//            // 使用ClassLoader加载properties配置文件生成对应的输入流
//            InputStream resourceAsStream = JdbcUtils.class.getClassLoader().getResourceAsStream("postgresql.properties");
//
//            // 使用properties对象加载输入流
//            properties.load(resourceAsStream);
//
//            // 创建连接池
//            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//            System.out.println(DruidDataSourceFactory.class.getClassLoader());
//
//            System.out.println(dataSource.getConnection());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }


    public static void main(String[] args) {

    }
}
