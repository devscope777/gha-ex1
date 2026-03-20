package com.example.gha_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GhaEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(GhaEx1Application.class, args);
	}

	public int add(int n1, int n2) {
		return n1 + n2;
	}

}
