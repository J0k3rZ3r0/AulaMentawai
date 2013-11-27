package br.com.cet.aula.service;

import br.com.cet.aula.modelo.Cliente;

public class ClienteService {
	
	public void salvar(Cliente cliente){
		
		System.out.println("ClienteService = nome cliente = " + cliente.getNome());
		
		// decida como salvar !!
		// ex: clienteDao.salvar(cliente);
		
	}
	
}
