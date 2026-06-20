/**
 * 
 */
package com.edhy.usuarios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/api/usuarios/")
public class HelloController {

	
	@GetMapping("ping")
	public String mensaje() {
		return "Hola Mundo -Usuarios";
	}
}
