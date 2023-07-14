package com.AsTecI.test.service;

import java.util.List;
import java.util.Optional;

import com.AsTecI.test.dto.IncidenciaDto;
import com.AsTecI.test.model.Incidencia;
import com.AsTecI.test.model.Operador;

public interface IncidenciaService {

	Optional<Incidencia> findIncidenciaById(Long id);
	
	List<Incidencia> findIncidencias();
	
	Incidencia findIncidenciaByDia(int dia);
	
	Incidencia findIncidenciaByOperador(Operador operador);
	
	void StoreIncidencia (IncidenciaDto incidenciaDto);
}
