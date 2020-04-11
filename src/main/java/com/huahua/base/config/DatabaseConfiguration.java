package com.huahua.base.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author GYM
 * @date 2020/4/9 16:01
 * @Description: TODO
 */
@Configuration
public class DatabaseConfiguration {
    public static final String DATASOURCE = "datasource";
    public static final String ORACLE_DATASOURCE = "oracleDatasource";

    @Bean(name = DATASOURCE)
    @Qualifier("datasource")
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    public DataSource dataSourceOne() {
        return new DruidDataSource();
    }



}
