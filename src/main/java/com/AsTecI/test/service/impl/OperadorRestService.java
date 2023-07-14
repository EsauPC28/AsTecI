package com.AsTecI.test.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.AsTecI.test.dto.OperadorDto;
import com.AsTecI.test.model.Operador;
import com.AsTecI.test.repository.OperadorRepository;
import com.AsTecI.test.service.OperadorService;

@Service
public class OperadorRestService implements OperadorService{

	private OperadorRepository operadorRepository;
	
	
	
	public OperadorRestService(OperadorRepository operadorRepository) {
		this.operadorRepository = operadorRepository;
	}

	@Override
	public Optional<Operador> findOperadorById(Long id) {
		
		return null;
	}

	@Override
	public void storeOperador(OperadorDto operadorDto) {

		Operador operador = new Operador();
		
		operador.setNombre(operadorDto.getNombre());
		operador.setApellido(operadorDto.getApellido());
		operador.setCargo(operadorDto.getCargo());
		operador.setEmail(operadorDto.getEmail());
		operador.setContrasena(operadorDto.getContrasena());
		
		operadorRepository.save(operador);
	}

}
