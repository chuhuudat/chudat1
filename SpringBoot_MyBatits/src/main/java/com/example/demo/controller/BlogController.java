package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {
	private BlogService blogService;

	public BlogController(BlogService blogService) {
		super();
		this.blogService = blogService;
	}

	@PostMapping
	public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog) {
		return new ResponseEntity<Blog>(blogService.saveBlog(blog), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Blog> getAllBlogs() {
		return blogService.getAllBlogs();
	}

	@GetMapping("{id}")
	public ResponseEntity<Blog> getBlogById(@PathVariable("id") Integer blogID) {
		return new ResponseEntity<Blog>(blogService.getBlogById(blogID), HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<Blog> updateBlog(@PathVariable("id") Integer blogID, @RequestBody Blog blog) {
		return new ResponseEntity<Blog>(blogService.updateBlog(blog, blogID), HttpStatus.OK);

	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteBlog(@PathVariable("id") Integer blogID){
		blogService.deleteBlog(blogID);
		
		return new ResponseEntity<String>("Blog deleted successfully!! ", HttpStatus.OK);
	}
}
