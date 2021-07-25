package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.repositroy.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
// hello world
	@Autowired
	private UserRepository userRepository;

	// get All users
	@GetMapping
	public List<User> getAllusers() {
		return userRepository.findAll();
	}

	// get user by Id
	@GetMapping("/{id}")
	public User getUserById(@PathVariable(value = "id") long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	// create user
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	// update user
	@PutMapping("/{id}")
	public User updateUser(@RequestBody User user, @PathVariable("id") long userId) {
		User existingUser = this.userRepository.findById(userId).orElse(null);
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());

		return this.userRepository.save(existingUser);

	}

	// delete by userId
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") long userId) {
		User existingUser = this.userRepository.findById(userId).orElse(null);
		this.userRepository.delete(existingUser);
		return ResponseEntity.ok().build();

	}

}
