package com.tiansuo.file.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tiansuo.file.storage.mapper")
@SpringBootApplication
public class FileStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileStorageApplication.class, args);
        System.out.println("=================================服务启动成功!=================================");
    }

}
