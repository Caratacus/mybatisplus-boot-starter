package com.baomidou;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import com.baomidou.mybatisplus.enums.DBType;
import com.baomidou.mybatisplus.enums.Optimize;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;

@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.sample.mapper*")
public class Application {

    protected final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
        logger.info("PortalApplication is sussess!");
    }

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType(DBType.POSTGRE.getDb());
        paginationInterceptor.setOptimizeType(Optimize.JSQLPARSER.getOptimize());
        return paginationInterceptor;
    }

}