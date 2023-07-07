package br.com.iwt.projetojsf.model;

import java.util.UUID;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Usuario {
	
	@EqualsAndHashCode.Include
	private UUID id;
	
	private String nome;
	
	private String senha;

}
