package com.betek.backend7.matriculas.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class JdbcConfig {

    @Bean
    public Connection jdbcConnection(@Value("${db.url}") String url,
                                     @Value("${db.user}") String user,
                                     @Value("${db.password}") String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
