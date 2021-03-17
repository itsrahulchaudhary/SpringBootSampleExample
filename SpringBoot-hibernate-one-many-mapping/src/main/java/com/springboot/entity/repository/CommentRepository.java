package com.springboot.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
