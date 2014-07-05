package org.upiita.spring.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.upiita.spring.formas.FormaSesion;

@Controller
public class LoginControlador {

	@Autowired
	private FormaSesion formaSesion;
	
	@RequestMapping(value="/login")
	public String login(Boolean errorLogin, Model modelo, HttpSession sesion){
		
		modelo.addAttribute("errorLogin", errorLogin);
		
		formaSesion.setItemsComprados(100);
		
		sesion.setAttribute("variable", 10);
		
		return "login";
	}
	
	@RequestMapping(value="/error-403")
	public String error403(Authentication autenticacion, Model modelo){
		
		//Usuario
		System.out.println("Nombre: " + autenticacion.getName());
		//Password
		System.out.println("Password: " + autenticacion.getCredentials());
		//Roles
		System.out.println("Roles: " + autenticacion.getAuthorities());
		//Desde sesion
		System.out.println("Items: " + formaSesion.getItemsComprados());
		
		modelo.addAttribute("email",autenticacion.getName());
		
		return "error-403";
	}
}
