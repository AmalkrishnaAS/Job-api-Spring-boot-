package com.example.telusko.dao;

import java.util.List;

import com.example.telusko.model.Post;

public interface SearchRepo {
	List<Post> findByText(String text) ;

}
