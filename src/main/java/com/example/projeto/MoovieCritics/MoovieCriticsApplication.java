package com.example.projeto.MoovieCritics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.projeto.MoovieCritics.data","com.example.projeto.MoovieCritics.service","com.example.projeto.MoovieCritics.control","com.example.projeto.MoovieCritics.model"})
public class MoovieCriticsApplication {
	public static void main(String[] args) {
		SpringApplication.run(MoovieCriticsApplication.class, args);
	}

}
