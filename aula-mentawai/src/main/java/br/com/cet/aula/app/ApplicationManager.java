package br.com.cet.aula.app;
import br.com.cet.aula.action.ClienteAction;
import br.com.cet.aula.validation.ClienteValidator;
import br.com.cet.aula.validation.ValidaTodosValidator;



public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	
	@Override
	public void loadFilters() {
		
	}
		
	@Override
	public void loadActions() {

		action(ClienteAction.class, "cadastro")
			.on(SUCCESS, fwd("/jsp/Cliente/cadastro.jsp"))
			.on(ERROR, fwd("/jsp/Cliente/cadastro.jsp"));
		
		action(ClienteAction.class, "salvar")
			.filter(new ClienteValidator())
			.on(SUCCESS, fwd("/jsp/Cliente/detalhes.jsp"))
			.on(ERROR, fwd("/jsp/Cliente/cadastro.jsp"));
		
	}
	
	
	@Override
	public void loadFormatters() {
	}
	
}
