package com.my_location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class MyLocationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyLocationApplication.class, args);
    }

}
