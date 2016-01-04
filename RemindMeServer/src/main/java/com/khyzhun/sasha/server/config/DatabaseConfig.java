package com.khyzhun.sasha.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories("com.khyzhun.sasha.server.repository")
@EnableTransactionManagement
@ComponentScan("com.khyzhun.sasha.server")
@PropertySource("classpath:db.properties")
public class DatabaseConfig {

    @Resource
    private Environment environment;

    public DataSource dataSource() {
        return null;
    }

}
