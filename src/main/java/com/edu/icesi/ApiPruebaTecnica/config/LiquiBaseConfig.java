package com.edu.icesi.ApiPruebaTecnica.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import liquibase.integration.spring.SpringLiquibase;

@Configuration
public class LiquiBaseConfig {
    @Bean
    public SpringLiquibase liquibase(DataSource dataSource){
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db/changelog/master.xml");
        liquibase.setDataSource(dataSource);
        return liquibase;
    }//End SoringLiquiBase
}//End LiquiBaseConfig
