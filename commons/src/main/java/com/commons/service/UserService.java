package com.commons.service;

import com.commons.entities.User;
import com.commons.manager.objectmanagers.ObjectManagerContext;

public class UserService {
	protected ObjectManagerContext oc;
	
	public UserService(ObjectManagerContext oc) {
		this.oc = oc;
	}
	
	public void createUser(User user) {
		
	}
	
	public User findUserByEmail(String email) {
		String query = "FROM Person p WHERE p.email = :email";
		
		//create query
		User person = oc.getSingleResult(User.class, query, "email", email);
		
		return person;
	}
}
