package com.pablo.ejemplo_formulario_spring_boot.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prueba_controlador {
	@PostMapping("/formulario")
	public String formulario(@RequestParam String nombre, @RequestParam int edad, @RequestParam String color ){
		String mensaje = edad>=18? "Mayor de edad" : "Menor de edad";
		return String.format("<h1>Hola %s.</h1><p>Tienes %d años, eres %s y seleccionaste el color %s</p>", nombre, edad, mensaje, color);

	}
}
