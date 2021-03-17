package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.entity.Comment;
import com.springboot.entity.Post;
import com.springboot.entity.repository.PostRepository;

@SpringBootApplication
public class SpringBootHibernateOneManyMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateOneManyMappingApplication.class, args);
	}
	

    @Autowired
    private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		 
		Post post = new Post("one to many mapping using JPA and hibernate", "one to many mapping using JPA and hibernate");

        Comment comment1 = new Comment("Very useful");
        Comment comment2 = new Comment("informative");
        Comment comment3 = new Comment("Great post");

        post.getComment().add(comment1);
        post.getComment().add(comment2);
        post.getComment().add(comment3);

        this.postRepository.save(post);
		
	}

}
