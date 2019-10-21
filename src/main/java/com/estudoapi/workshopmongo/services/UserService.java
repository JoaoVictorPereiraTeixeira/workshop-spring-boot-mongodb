package com.estudoapi.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudoapi.workshopmongo.domain.User;
import com.estudoapi.workshopmongo.repository.UserRepository;
import com.estudoapi.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		if (!user.isPresent()) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		} 
		return user.get();
	}
}
