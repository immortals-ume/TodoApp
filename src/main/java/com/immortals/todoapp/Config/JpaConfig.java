package com.immortals.todoapp.Config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JpaConfig {
    private static final String driverClassname = "com.mysql.cj.jdbc.Driver";
    private static final String DBurl = "jdbc:mysql://localhost:3306/todo";
    private static final String username = "root";
    private static final String password = "ish12kap";

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(driverClassname);
        dataSourceBuilder.url(DBurl);
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }

}
