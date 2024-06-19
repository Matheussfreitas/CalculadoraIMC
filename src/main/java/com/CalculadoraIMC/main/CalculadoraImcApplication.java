package com.CalculadoraIMC.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraImcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraImcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Menu menu = new Menu();
		menu.exibeMenu();
	}
}
