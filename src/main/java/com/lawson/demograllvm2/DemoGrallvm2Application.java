package com.lawson.demograllvm2;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ForestScan(basePackages = "com.lawson.demograllvm2.http.api")
@MapperScan(basePackages = "com.lawson.demograllvm2.mapper")
public class DemoGrallvm2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoGrallvm2Application.class, args);
    }

}
