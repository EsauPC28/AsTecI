package com.AsTecI.test.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IncidenciaDto {

	private Long id;
	
	@NotEmpty
	private int dia;
	@NotEmpty
	private String descripcion;
	@NotEmpty
	private Boolean status;
	
}
