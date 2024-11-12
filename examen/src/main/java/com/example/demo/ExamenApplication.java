package com.example.demo;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RequestMapping("/teorico")
@SpringBootApplication

public class ExamenApplication {
	public ArrayList<Integer> generador() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random random = new Random();
		for(int i = 1; i < 5; i++) {
			numeros.add(random.nextInt(100));
		}
		return numeros;
	}
	@GetMapping("/promedio")
	public String promedio() {
		int suma = 0;
		int promedio = 0;
		suma = suma + numeros;
		promedio = promedio + suma / numeros;
		return ("promedio de numeros: " + promedio);
	}
	@GetMapping("/teorico")
	public String teorico() {
		return "La sobreescritura es un proceso que consiste en redefinir un método de una clase padre en una clase hija que hereda de ella. La sobrecarga de métodos es una característica de programación que consiste en definir varios métodos con el mismo nombre, pero con diferentes listas de parámetros.";
	}
	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

}
