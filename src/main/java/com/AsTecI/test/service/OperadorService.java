package com.AsTecI.test.service;

import java.util.Optional;

import com.AsTecI.test.dto.OperadorDto;
import com.AsTecI.test.model.Operador;

public interface OperadorService {

	Optional<Operador> findOperadorById(Long id);
	
	void storeOperador (OperadorDto operadorDto);
}
