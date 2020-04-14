package com.huahua.base.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author GYM
 * @date 2020/4/9 16:01
 * @Description: 多数据源配置
 */
@Configuration
public class DatabaseConfiguration {
    public static final String DATASOURCE = "datasource";
    public static final String SLAVE_DATASOURCE = "slave_datasource";

    @Bean(name = DATASOURCE)
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary  // 表示这个数据源是默认数据源
    public DataSource dataSourceOne() {
        return  DruidDataSourceBuilder.create().build();
    }

    @Bean(name = SLAVE_DATASOURCE)
    @ConfigurationProperties(prefix = "spring.oracle_datasource")
    public DataSource dataSourceTwo() {
        return DruidDataSourceBuilder.create().build();
    }

}
