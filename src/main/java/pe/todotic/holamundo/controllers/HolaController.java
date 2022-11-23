package pe.todotic.holamundo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.todotic.holamundo.models.Persona;

@RestController
@RequestMapping("/api/v1")
public class HolaController {
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/hola-mundo/{numero}")
	public String saludar(@RequestParam(required = true, defaultValue = "mundo") String nombre,
			@RequestBody Persona persona,
			@PathVariable Integer numero) {
		return "Hola " + nombre  +"!";
	}
}
