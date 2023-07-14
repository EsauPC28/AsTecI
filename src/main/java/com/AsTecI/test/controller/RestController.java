package com.AsTecI.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.AsTecI.test.dto.OperadorDto;
import com.AsTecI.test.service.OperadorService;

import jakarta.validation.Valid;

@Controller
public class RestController {

	private OperadorService operadorService;
	
	public RestController(OperadorService operadorService) {
		this.operadorService = operadorService;
	}
	
	@GetMapping("/registroOperador")
	public String showRegistrationForm(Model model) {
		
		OperadorDto operador = new OperadorDto();
		model.addAttribute("operador",operador);
		return "registroOperador";
	}
	
	@PostMapping("/RegistroOperador/save")
	public String RegistroOperador(@Valid @ModelAttribute("operador")OperadorDto operadorDto,
			BindingResult result,
			Model model) 
	{
		
		operadorService.storeOperador(operadorDto);
		
		return "redirect: registroOperador?success";
	}
	
}
