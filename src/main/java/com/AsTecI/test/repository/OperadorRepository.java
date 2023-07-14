package com.AsTecI.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AsTecI.test.model.Operador;

public interface OperadorRepository extends JpaRepository<Operador, Long>{
	
	<Optional>Operador findById(Long id);

}
