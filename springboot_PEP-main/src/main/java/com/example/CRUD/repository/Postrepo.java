package com.example.CRUD.repository;

import com.example.CRUD.entity.Post;
import com.example.CRUD.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Postrepo extends JpaRepository<Post, Long> {
    public List<Post> findAllByUserId(Long userId);
}

