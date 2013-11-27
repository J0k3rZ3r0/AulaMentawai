package br.com.cet.aula.validation;

import org.mentawai.core.Action;
import org.mentawai.filter.ValidationFilter;
import org.mentawai.rule.IntegerRule;
import org.mentawai.rule.RequiredRule;
import org.mentawai.validation.Validator;

public class ClienteValidator extends ValidationFilter {

	@Override
	public void prepareValidator(Validator validator, Action action,String innerAction) {
		
		validator.add("nome", RequiredRule.getInstance(), "campo obrigatório");
		validator.add("cpf", RequiredRule.getInstance(), "campo obrigatório");
		validator.add("idade", RequiredRule.getInstance(), "campo obrigatório");
		
		validator.add("idade", IntegerRule.getInstance(18, 30), "cresça menino !");
		
	}
	
	
}
