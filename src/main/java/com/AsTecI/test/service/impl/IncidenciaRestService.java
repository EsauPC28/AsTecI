package com.AsTecI.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.AsTecI.test.dto.IncidenciaDto;
import com.AsTecI.test.model.Incidencia;
import com.AsTecI.test.model.Operador;
import com.AsTecI.test.repository.IncidenciaRepository;
import com.AsTecI.test.service.IncidenciaService;

@Service
public class IncidenciaRestService implements IncidenciaService{

	private IncidenciaRepository incidenciaRepository;
	
	public IncidenciaRestService (IncidenciaRepository incidenciaRepository) {
		this.incidenciaRepository = incidenciaRepository;
	}
	
	@Override
	public Optional<Incidencia> findIncidenciaById(Long id) {
	
		return incidenciaRepository.findById(id);
	}

	@Override
	public Incidencia findIncidenciaByDia(int dia) {
		return incidenciaRepository.findByDia(dia);
	}

	@Override
	public Incidencia findIncidenciaByOperador(Operador operador) {
		return incidenciaRepository.findByOperador(operador);
	}

	@Override
	public void StoreIncidencia(IncidenciaDto incidenciaDto) {

		Incidencia incidencia = new Incidencia();
		
		incidencia.setDescripion(incidenciaDto.getDescripcion());
		incidencia.setDia(incidenciaDto.getDia());
		incidencia.setStatus(incidenciaDto.getStatus());
		
		incidenciaRepository.save(incidencia);
	}

	@Override
	public List<Incidencia> findIncidencias() {
		return incidenciaRepository.findAll();
	}

}
