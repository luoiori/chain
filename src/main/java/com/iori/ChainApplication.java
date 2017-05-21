package com.iori;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.iori.mapper")
public class ChainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChainApplication.class, args);
	}
}
