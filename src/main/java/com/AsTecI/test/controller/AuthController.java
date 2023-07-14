package com.AsTecI.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.AsTecI.test.dto.IncidenciaDto;
import com.AsTecI.test.service.IncidenciaService;

import jakarta.validation.Valid;

@Controller
public class AuthController {

	private IncidenciaService incidenciaService;
	
	public AuthController(IncidenciaService incidenciaService) {
		this.incidenciaService = incidenciaService;
	}
	
	@GetMapping("/registroIncidencia")
	public String showRegistrationForm(Model model) { 
		IncidenciaDto incidencia = new IncidenciaDto();
		model.addAttribute("incidencia",incidencia);
		return "registroIncidencia";
	}
	
	@PostMapping("/RegistroIncidencia/save")
	public String RegistroIncidencia(@Valid @ModelAttribute("incidencia")IncidenciaDto incidenciaDto,
			BindingResult result,
			Model model) 
	{
		incidenciaService.StoreIncidencia(incidenciaDto);
		
		return "redirect: registroIncidencia?success";
	}
}
