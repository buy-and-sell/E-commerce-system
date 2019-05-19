package com.sajinika.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sajinika.demo.model.User;
import com.sajinika.demo.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired 
	UserRepository repository;
		
	@PostMapping("/adduser")
	public User addUser(User user) {
		
		repository.save(user);
		return user;
	}
	
	
	  @GetMapping("/allusers") 
	  public List<User> getUsers() {
	  
		  return repository.findAll(); 
	  }
	  
	  @RequestMapping("/userbyid/{id}")
		public Optional<User> getUser(@PathVariable("id") int id) {
			
			return repository.findById((long) id);
		}
	  
	  @DeleteMapping("/deleteuser/{id}")
		public String deleteUSer(@PathVariable int id) {
			
		  User user = repository.getOne((long) id);
			repository.delete(user);
			
			return "Deleted";
		}
	  
	  @PutMapping("/updateuser/{id}")
		public User saveOrUpdateUser( User user) {
			
			repository.save(user);
			return user;
	  }	

}
