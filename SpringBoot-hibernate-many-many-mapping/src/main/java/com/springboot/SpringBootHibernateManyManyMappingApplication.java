package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.entity.Post;
import com.springboot.entity.Tag;
import com.springboot.repository.PostRepository;

@SpringBootApplication
public class SpringBootHibernateManyManyMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateManyManyMappingApplication.class, args);
	}
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
	   Post post1 = new Post("Post1" , "Hibernate Many to Many Mapping Example with Spring Boot", "Hibernate Many to Many Mapping Example with Spring Boot");
	
	   Post post2 = new Post("Post2", 
				"Hibernate Many to Many Mapping Example with Spring Boot", 
				"Hibernate Many to Many Mapping Example with Spring Boot");
	   
	   Tag springBoot = new Tag("SpringBoot");
	   Tag hibernate = new Tag("Hibernate");
	   
	   // add tag references post
	   post1.getTags().add(springBoot);
	   post1.getTags().add(hibernate);
	   
	   post2.getTags().add(hibernate);
	   
	   // add post references tag
	   springBoot.getPosts().add(post1);
	   hibernate.getPosts().add(post1);
	   
	   hibernate.getPosts().add(post2);
	   
	   this.postRepository.save(post1);
	   this.postRepository.save(post2);
	   
	}
	
	

}
