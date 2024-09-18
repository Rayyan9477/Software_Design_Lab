package Rayyan.SpringBootRest.controller;
import java.util.List;

import Rayyan.SpringBootRest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Rayyan.SpringBootRest.entity.User;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id) {
		return service.findOne(id);
	}

//method that posts a new user detail   
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		User sevedUser = service.save(user);
		return sevedUser;
	}

//method that delete a user resource  
//if the user deleted successfully it returns status 200 OK otherwise 404 Not Found  
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) throws Exception {
		try { 
			  service.deleteById(id);
		}
		catch (Exception e)
		{//runtime exception  
			throw new Exception("Not found id: " + id);
		}
		}

//Method to update an existing user
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id) {
		User existingUser = service.findOne(id);
		if (existingUser == null) {
			throw new RuntimeException("User not found with id: " + id);
		}
		user.setId(id); // Ensure the ID in the request body matches the path variable
		return service.updateUser(user);
	}
}
