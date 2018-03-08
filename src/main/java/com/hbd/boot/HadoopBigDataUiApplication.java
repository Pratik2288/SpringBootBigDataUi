package com.hbd.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class HadoopBigDataUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HadoopBigDataUiApplication.class, args);
	}
}
