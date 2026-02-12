package com.example.CRUD.repository;

import com.example.CRUD.entity.Post;
import com.example.CRUD.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Postrepo extends JpaRepository<Post, Long> {}

