package com.huahua.base.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.core.io.Resource;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author GYM
 * @date 2020/4/12 10:44
 * @Description: 从数据库配置
 */
@Configuration
// 通过basePackages 和 sqlSessionFactoryRef 绑定数据源和mapper
@MapperScan(basePackages = "com.huahua.mapper.erm",sqlSessionFactoryRef = "ermSqlSessionFactory") //扫描的mapper
public class MybatisBaseConfig2 {
    @Autowired
    @Qualifier(value = DatabaseConfiguration.SLAVE_DATASOURCE)
    DataSource dataSource;
    @Bean(name = "ermSqlSessionFactory")
    public SqlSessionFactory ermSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        // 数据源
        factory.setDataSource(dataSource);
        // 实体文件位置
        factory.setTypeAliasesPackage("com.huahua.domain");
        // 添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factory.setMapperLocations(resolver.getResources("classpath:mapper/erm/*.xml"));
        return factory.getObject();
    }

    @Bean(name = "ermSqlSessionTemplate")
    public SqlSessionTemplate ermSqlSessionTemplate(@Qualifier("ermSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


    @Bean(name = "ermTransactionManager")
    public DataSourceTransactionManager ermTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
