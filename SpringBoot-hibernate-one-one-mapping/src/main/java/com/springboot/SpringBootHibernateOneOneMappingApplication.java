package com.springboot;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.entity.Gender;
import com.springboot.entity.User;
import com.springboot.entity.UserProfile;
import com.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringBootHibernateOneOneMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateOneOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// User Object
		User user = new User();
		user.setName("Raju");
		user.setEmail("raju121@gmail.com");
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Noida");
		userProfile.setGender(Gender.MALE);
		userProfile.setBirthOfDate(LocalDate.of(1970, 03, 27));
		userProfile.setPhoneNumber("9998887776");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
		
	}

}
