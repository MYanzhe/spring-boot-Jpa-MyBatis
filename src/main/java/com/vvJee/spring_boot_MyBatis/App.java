package com.vvJee.spring_boot_MyBatis;

import org.mybatis.spring.annotation.MapperScan;
/**
 * Hello world!
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vvJee.spring_boot_MyBatis.mapper")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
