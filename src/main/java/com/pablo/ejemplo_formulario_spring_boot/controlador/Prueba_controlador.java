package com.pablo.ejemplo_formulario_spring_boot.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Prueba_controlador {
	@PostMapping("/formulario")
	public String formulario(Model model, @RequestParam String nombre, @RequestParam int edad, @RequestParam String color ){
		String mensaje = edad>=18? "Mayor de edad" : "Menor de edad";
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("nombre", nombre);
		model.addAttribute("color", color);
		model.addAttribute("edad", edad);
		return "ok";

//		return String.format("<h1>Hola %s.</h1><p>Tienes %d años, eres %s y seleccionaste el color %s</p>", nombre, edad, mensaje, color);

	}
}
