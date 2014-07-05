package org.upiita.spring.formas;

//@Scope(""session) Anotation para mantenerlo en Session
public class FormaSesion {
	
	private Integer itemsComprados = 0;

	public Integer getItemsComprados() {
		return itemsComprados;
	}

	public void setItemsComprados(Integer itemsComprados) {
		this.itemsComprados = itemsComprados;
	}

}
