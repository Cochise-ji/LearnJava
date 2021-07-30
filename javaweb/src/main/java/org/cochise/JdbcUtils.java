package org.cochise;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
    private static DruidDataSource dataSource;

    // 使用DriverManager连接数据库
    static {
        try {
            // 加载驱动
            // java6以后,不需要手动加载驱动
            Class.forName("org.postgresql.Driver");

            System.out.println(DriverManager.getConnection("jdbc:postgresql://localhost:5432/sln", "sln", "planexus"));
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

    // 使用Druid连接池连接数据库
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
