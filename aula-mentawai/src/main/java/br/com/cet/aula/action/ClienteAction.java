package br.com.cet.aula.action;

import java.util.Date;
import java.util.Iterator;

import org.mentawai.core.BaseAction;

import br.com.cet.aula.modelo.Cliente;
import br.com.cet.aula.service.ClienteService;

public class ClienteAction extends BaseAction {
	
	public String cadastro(){
		
		System.out.println("abrindo formulario... ");
		
		return SUCCESS;
	}
	
	
	public String salvar(){
		
		System.out.println("salvando cliente ....");
		
		String nome = input.getString("nome");
		String cpf = input.getString("cpf");
		int idade = input.getInt("idade", 18);
		
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setIdade(idade);
		
		ClienteService clienteService = new ClienteService();
		clienteService.salvar(cliente);
		
		output.setValue("nome", nome);
		output.setValue("cpf", cpf);
		output.setValue("idade", idade);
		
		return SUCCESS;
		
	}
	
	
//	public String salvar(){
//		
//		System.out.println("salvando cliente ....");
//		
//		String nome = input.getString("nome");
//		String cpf = input.getString("cpf");
//		String idade = input.getString("idade");
////		String dataNasc = input.getString("dataNasc");
//		
//		boolean existeErro = false;
//		
//		String[] camposObrigatorios = {"nome", "cpf", "idade", "datanas"};
//		
//		for (String campo : camposObrigatorios) {
//			if(!validar(campo)){
//				existeErro = true;
//			}
//		}
//		
//		
//		if(existeErro){
//			return ERROR;
//		}
//		
//		
//		output.setValue("nome", nome);
//		output.setValue("cpf", cpf);
//		
//		return SUCCESS;
//		
//	}
	
	
	public String excluir(){
		return SUCCESS;
	}
	
	public String editar(){
		return SUCCESS;
	}
	
	public String listar(){
		return SUCCESS;
	}
	
	public String busca(){
		return SUCCESS;
	}

}
