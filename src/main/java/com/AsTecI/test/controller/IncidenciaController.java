package com.AsTecI.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AsTecI.test.model.Incidencia;
import com.AsTecI.test.model.Operador;
import com.AsTecI.test.service.IncidenciaService;

@RestController
public class IncidenciaController {

	@Autowired
	IncidenciaService insidenciaService;
	
	public IncidenciaController (IncidenciaService insidenciaService) {
		this.insidenciaService = insidenciaService;
	}
	
	@RequestMapping("api/incidencias")
	public List<Incidencia> getAllIncidencias() {
		return insidenciaService.findIncidencias();
	}
	
	@GetMapping("api/incidencia/{id}")
	public Optional<Incidencia> searchIncidenciaById(@PathVariable("id")Long id) {
		return insidenciaService.findIncidenciaById(id);
	}
	
	@GetMapping("api/incidencia/dia/{dia}")
	public Incidencia searchIncidenciaBydia(@PathVariable("dia")int dia) {
		return insidenciaService.findIncidenciaByDia(dia);
	}
	
	@GetMapping("api/incidencia/operador/{operador}")
	public Incidencia searchIncidenciaByOperador(@PathVariable("operador")Operador operador) {
		return insidenciaService.findIncidenciaByOperador(operador);
	}
}
