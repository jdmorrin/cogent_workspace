package cogent1.com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cogent1.com.entities.User;
import cogent1.com.repositories.UserRepositories;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/assesment/user")
public class UserController {
	@Autowired
	private UserRepositories repo;
	
	@GetMapping("/all")
	public List<User> getAll() {
		return (List<User>)repo.findAll();
	}
	
	@GetMapping("/get")
	public Optional<User> getUser(@RequestParam(value = "id") Long id) {
		return repo.findById(id);
	}
	
	@PostMapping("/post")
	public User addUser(@RequestBody User user) {
		return repo.save(user);
	}
	
	// Implement later
	@PutMapping("/update")
	public void updateUser() {
		
	}
	
	@DeleteMapping("/delete")
	public void deleteUser(@RequestParam(value = "id") Long id) {
		Optional<User> i = repo.findById(id);
		repo.delete(i.get());
	}
}
