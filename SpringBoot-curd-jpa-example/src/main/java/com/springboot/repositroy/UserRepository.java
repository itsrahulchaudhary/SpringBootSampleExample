package com.springboot.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	

}
