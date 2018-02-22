package com.proyectoViajes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoViajes.dao.UserDAO;
import com.proyectoViajes.model.UserInfo;

@Service
public class UserService{
	
	@Autowired	
	private UserDAO userDAO;
	
	public UserInfo getDataByUserName(String userName) {
		return userDAO.getActiveUser(userName);
	}
} 
