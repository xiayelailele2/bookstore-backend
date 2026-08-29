package com.bookstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bookstore.mapper")
public class BookstoreBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookstoreBackendApplication.class, args);
    }
}
