package com.AsTecI.test.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OperadorDto {

	private Long id;
	@NotEmpty
	private String nombre;
	
	private String apellido;
	@NotEmpty
	private String cargo;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String contrasena;
}
