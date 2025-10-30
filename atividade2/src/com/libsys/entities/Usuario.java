package com.libsys.entities;

import com.libsys.services.EmailInvalidoException;
import com.libsys.services.NomeInvalidoException;

public class Usuario extends Pessoa {
	private Integer matricula; 
	
	public Usuario(String nome, String email, Integer matricula) throws Exception {
		super(nome, email);
		this.matricula = matricula; 
		
		/* incapacita o usuario de inserir dados invalidos */
		if (nome == null || nome.length() < 1) {
			throw new NomeInvalidoException();
		}
		/* incapacita o usuario de inserir dados invalidos */
		if (email == null || email.length() < 3) {
			throw new EmailInvalidoException();
		}
		
		
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void exibirInfo() {
		/* implementation of abstract method */
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + getMatricula());
	}
}
