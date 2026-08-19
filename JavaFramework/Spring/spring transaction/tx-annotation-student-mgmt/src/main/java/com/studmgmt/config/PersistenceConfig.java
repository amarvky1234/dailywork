package com.studmgmt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.studmgmt.dao"})
@PropertySource("classpath:db.properties")
public class PersistenceConfig {

    @Bean
    public DataSource dataSource(@Value("${db.driverClassName}") String driverClassName,
                                 @Value("${db.url}") String url,
                                 @Value("${db.username}") String un,
                                 @Value("${db.password}") String pwd){

        DriverManagerDataSource dataSource = new DriverManagerDataSource(url, un, pwd);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate npJdbcTemplate(DataSource dataSource){
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
