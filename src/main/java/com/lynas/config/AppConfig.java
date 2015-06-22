package com.lynas.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by sazzad on 6/22/15.
 */
@Configuration
@EnableWebMvc
public class AppConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver iRVR = new InternalResourceViewResolver();
        iRVR.setPrefix("/jsp/");
        iRVR.setSuffix(".jsp");
        return iRVR;

    }

    @Bean
    public JdbcTemplate jdbcConncection() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.addConnectionProperty("destroy-method", "close");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost/inventory_management");
        dataSource.setPassword("s2014");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
}
