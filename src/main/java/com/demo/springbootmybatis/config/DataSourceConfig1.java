package com.demo.springbootmybatis.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

//@Configuration
//@MapperScan(basePackages = "com.demo.springbootmybatis.dao",sqlSessionFactoryRef = "test1SqlSessionFactory")
public class DataSourceConfig1 {

    @Bean(name="test1DataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.test1")
    public DataSource getDataSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "test1SqlSessionFactory")
    @Primary
    // @Qualifier表示查找Spring容器中名字为test1DataSource的对象
    public SqlSessionFactory test1SqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //读取mybatis配置文件
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/test1/mybatis-config.xml"));
        bean.setMapperLocations(
                //设置mybatis的xml所在路径
                new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/test1/mapper/*.xml")
        );
        return bean.getObject();
    }

    @Bean(name = "test1SqlSessionTemplate")
    @Primary
    public SqlSessionTemplate test1Sqlsessiontemplate(
            @Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
