package com.example.CRUD.controller;

import com.example.CRUD.dto.PostResponseDto;
import com.example.CRUD.entity.Post;
import com.example.CRUD.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    // GET all posts
    @GetMapping
    public List<PostResponseDto> getAllPost() {
        return postService.findAll();
    }

    // CREATE post
    @PostMapping
    public PostResponseDto createPost(@RequestBody Post post) {
        return postService.create(post);
    }
}
