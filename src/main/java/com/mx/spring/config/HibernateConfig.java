
package com.mx.spring.config;

import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.mx.spring"})
public class HibernateConfig {
    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s){
        
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        
        txManager.setSessionFactory(s);
        
        return txManager;
    }
    
    @Bean
    public DataSource dataSource(){
        
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=convertToNull");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
    
    
    private Properties hibernateProperties(){
        Properties prop = new Properties();
        prop.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        
        return prop;
    }
    
    
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource((javax.sql.DataSource) dataSource());
        sessionFactory.setPackagesToScan("com.mx.spring");
        sessionFactory.setHibernateProperties(hibernateProperties());
        
        return sessionFactory;
    }
}
