package com.AsTecI.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AsTecI.test.model.Incidencia;
import com.AsTecI.test.model.Operador;

public interface IncidenciaRepository extends JpaRepository<Incidencia, Long>{

	Optional<Incidencia> findById(Long id);
	
	Incidencia findByDia (int dia);
	
	Incidencia findByOperador (Operador operador);
	
}
