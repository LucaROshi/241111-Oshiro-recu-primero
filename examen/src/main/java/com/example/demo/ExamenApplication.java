package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/promedio")
@SpringBootApplication
public class ExamenApplication {
	public ArrayList<Integer> generador() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(19);
		numeros.add(34);
		numeros.add(4);
		numeros.add(45);
		numeros.add(8);
		return numeros;
	}
	public void promedio() {
		if() {
			
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

}
