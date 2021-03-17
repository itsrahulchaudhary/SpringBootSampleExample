package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long>{

}
