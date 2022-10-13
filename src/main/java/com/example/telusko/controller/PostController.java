package com.example.telusko.controller;
import com.example.telusko.dao.PostRepo;
import com.example.telusko.dao.SearchRepoImpl;
import com.example.telusko.model.Post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.telusko.model.Post;

@RestController
public class PostController {
	@Autowired
	PostRepo repo;
	@Autowired
	SearchRepoImpl srepo;
	@GetMapping("/posts")
	public List<Post> getAllPosts() {
		return repo.findAll();
	}
	@GetMapping("/posts/{text}")
	public List<Post> getByText(@PathVariable String text) {
		return srepo.findByText(text);
	}
	@PostMapping("/post")
	public Post addPost(@RequestBody Post post) {
		try {
			repo.save(post);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return post;
	}

}
