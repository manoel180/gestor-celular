package br.com.gc.presentation.converter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

public class ConverterUtil<E> implements Converter {

	private Map<Object, Object> mapa;

	/**
	 * 
	 * @param entidades
	 */
	public ConverterUtil(List<E> entidades) {
		mapa = new HashMap<Object, Object>();

		for (E entidade : entidades)
			mapa.put(entidade.hashCode(), entidade);
	}

	/**
	 * 
	 * @param entidades
	 */
	@SafeVarargs
	public ConverterUtil(E... entidades) {
		mapa = new HashMap<Object, Object>();

		for (E entidade : entidades)
			mapa.put(entidade.hashCode(), entidade);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		if (value == null || value.equals("") || value.trim().length() == 0)
			return null;

		return mapa.get(value);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value == null || value.equals("")
				|| value.toString().trim().length() == 0)
			return "";
		//String retorno = null;
		//Identificavel<?> identificavel = (Identificavel<?>) value;

		//retorno = identificavel.getPK().toString();
		return value.toString();
	}

}
