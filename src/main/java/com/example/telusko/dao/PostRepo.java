package com.example.telusko.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.telusko.model.Post;

public interface PostRepo extends MongoRepository<Post, String> {
	
}
