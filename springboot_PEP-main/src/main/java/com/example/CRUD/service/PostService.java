package com.example.CRUD.service;

import com.example.CRUD.entity.Post;
import com.example.CRUD.repository.Postrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private Postrepo repo;

    // CREATE
    public Post savePost(Post post){
        return repo.save(post);
    }

    // READ ALL
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    // READ ONE



    // DELETE
    public void deletePost(long id){
        repo.deleteById(id);
    }
}


/*
-------------------------------------------------------------------------
                  POST SERIVICE <CRUD>

//get all post of a user

//create a post
//deleye a post
//get all post
//get one post
//delete a post

-------------------------------------------------------------------------
 */