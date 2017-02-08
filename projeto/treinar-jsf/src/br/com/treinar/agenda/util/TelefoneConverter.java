package br.com.treinar.agenda.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.treinar.agenda.modelo.Telefone;

@FacesConverter("br.com.treinar.agenda.util.TelefoneConverter")
public class TelefoneConverter implements Converter  {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String ddd = value.substring(1, 3);
		String numero = value.substring(4, 13);
		Telefone t = new Telefone();
		t.setDdd(Integer.parseInt(ddd));
		t.setNumero(Integer.parseInt(numero));
		return t;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		Telefone telefone = (Telefone) value;
		String telefoneStr = "(" + telefone.getDdd() + ")" + telefone.getNumero();
		
		return telefoneStr;
	}

}
