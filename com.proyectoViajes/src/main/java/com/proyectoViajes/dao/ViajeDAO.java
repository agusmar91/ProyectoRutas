package com.proyectoViajes.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.proyectoViajes.model.Viaje;

@Repository("viajeDAO")
@Transactional
public class ViajeDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	public ArrayList<Viaje> selectAllByPlace(String ciudad){
		
		//Criteria criteria = getSession().createCriteria("");
		return (ArrayList<Viaje>) hibernateTemplate.find("from Viajes where origen like '"+ ciudad);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Viaje> selectAll(String ciudad){
		
		//Criteria criteria = getSession().createCriteria("");
		return (ArrayList<Viaje>) hibernateTemplate.find("from Viajes");
	}
	
	public void insert (Viaje viaje) {
		
		hibernateTemplate.persist(viaje);
		
	}

}
