package com.proyectoViajes.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyectoViajes.dao.ViajeDAO;
import com.proyectoViajes.model.Viaje;

public class ViajeService {

	@Autowired
	private ViajeDAO viajeDAO;

	public ArrayList<Viaje> selectAllByPlace(String ciudad){		
		return viajeDAO.selectAllByPlace(ciudad);
		
	}
	
	public ArrayList<Viaje> selectAll(String ciudad){		
		return viajeDAO.selectAll(ciudad);
		
	}
	
	public void insert (Viaje viaje) {
		
		viajeDAO.insert(viaje);
		
	}
	
	
}
