package com.example.CRUD.service;


import com.example.CRUD.dto.PostResponseDto;
import com.example.CRUD.entity.Post;
import com.example.CRUD.repository.Postrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService {

    @Autowired
    private Postrepo postRepository;


    private PostResponseDto toDto(Post post){
        PostResponseDto dto = new PostResponseDto();
        dto.setUsername(post.getUser().getUsername());
        dto.setContent(post.getContent());
        dto.setCreatedAt(post.getCreatedAt());
        dto.setMediaUrl(post.getMediaUrl());
        return dto;
    }


    public List<PostResponseDto> findAll(){
        return postRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }


    public List<PostResponseDto> findAllByUserId(Long userId){
        return postRepository.findAllByUserId(userId)
                .stream()
                .map(this::toDto)
                .toList();
    }


    public PostResponseDto findById(Long id){
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));
        return toDto(post);
    }

    public PostResponseDto delete(Long id){
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));
        postRepository.delete(post);
        return toDto(post);
    }

    public PostResponseDto create(Post post){
        Post saved = postRepository.save(post);
        return toDto(saved);
    }


    public PostResponseDto update(Post post){
        Post oldPost = postRepository.findById(post.getId())
                .orElseThrow(() -> new RuntimeException("Post not found"));

        if(post.getContent()!=null)
            oldPost.setContent(post.getContent());

        if(post.getMediaUrl()!=null)
            oldPost.setMediaUrl(post.getMediaUrl());

        Post saved = postRepository.save(oldPost);
        return toDto(saved);
    }
}
