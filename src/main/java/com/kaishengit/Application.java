package com.kaishengit;

import com.kaishengit.dao.ProductDao;
import com.kaishengit.service.ProductService;
import com.kaishengit.service.impl.ProductServiceImpl;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by 蔡林红 on 2017/10/30.
 */
@Configuration//xml配置
@ComponentScan//自动扫描
@PropertySource("classpath:config.properties")//加载Properties文件
public class Application {

  /*  @Value("${jdbc.driver}")
    private  String driverClassName;*/
  @Autowired
  private Environment environment;//获得Properties内的值

    @Bean
    public DataSource dataSource(){
        //数据库连接池 dbcp
        BasicDataSource basicDataSource= new BasicDataSource();
        basicDataSource.setDriverClassName(environment.getProperty("jdbc.driver"));
        basicDataSource.setUrl(environment.getProperty("jdbc.url"));
        basicDataSource.setUsername(environment.getProperty("jdbc.name"));
        basicDataSource.setPassword(environment.getProperty("jdbc.password"));
        return basicDataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
}
