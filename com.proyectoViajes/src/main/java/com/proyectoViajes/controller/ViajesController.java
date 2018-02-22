package com.proyectoViajes.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ViajesController {

	@RequestMapping(value="/inicio")
	public String principal() {
		
		return "redirect:index.jsp";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		
		return "login";
	}
}
