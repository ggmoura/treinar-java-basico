package br.com.treinar.agenda.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.treinar.agenda.modelo.Telefone;

@FacesValidator("br.com.treinar.agenda.util.TelefoneValidator")
public class TelefoneValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		Telefone telefone = (Telefone) value;
		if (telefone.getDdd() < 10 || telefone.getDdd() > 100) {
			FacesMessage msg = new FacesMessage("Telefone", "DDD Telefone inválido");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);	
			throw new ValidatorException(msg);
		}
		
	}

}
