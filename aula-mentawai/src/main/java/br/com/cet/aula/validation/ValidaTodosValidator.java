package br.com.cet.aula.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.mentawai.core.Action;
import org.mentawai.core.Input;
import org.mentawai.filter.ValidationFilter;
import org.mentawai.rule.RequiredRule;
import org.mentawai.validation.Validator;

public class ValidaTodosValidator  extends ValidationFilter {
	
	private List<String> ignorados = new ArrayList<String>();

	public ValidaTodosValidator(String... ignorados) {
		this.ignorados = Arrays.asList(ignorados);
	}

	@Override
	public void prepareValidator(Validator validator, Action action, String innerAction) {
		
		Input input = action.getInput();
		Iterator<String> keys = input.keys();
		
		while (keys.hasNext()) {
			String field = (String) keys.next();
			
			if(ignorados != null){

				if( ! ignorados.contains(field)){
					validator.add(field, RequiredRule.getInstance(), "campo obrigatório");
				}
				
			}
			
			
		}
	
	}
}
