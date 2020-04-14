package com.huahua.base.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author GYM
 * @date 2020/4/9 15:28
 * @Description: 主数据库配置
 */
@Configuration
// 通过basePackages 和 sqlSessionFactoryRef 绑定数据源和mapper
@MapperScan(basePackages = "com.huahua.mapper",sqlSessionFactoryRef = "sqlSessionFactory")
public class MybatisBaseConfig {
    @Autowired
    @Qualifier(value = DatabaseConfiguration.DATASOURCE)
    DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactory test1SqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        // 数据源
        factory.setDataSource(dataSource);
        // 实体文件位置
        factory.setTypeAliasesPackage("com.huahua.domain");
        // 添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        return factory.getObject();
    }

    @Bean(name = "sqlSessionTemplate")
    @Primary
    public SqlSessionTemplate SqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


    @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
