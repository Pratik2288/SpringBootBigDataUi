package com.hbd.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan( basePackages = {"com.hbd.pojo"})
public class HadoopBigDataUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HadoopBigDataUiApplication.class, args);
	}
}
