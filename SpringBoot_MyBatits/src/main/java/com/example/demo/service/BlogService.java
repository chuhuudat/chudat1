package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Blog;


public interface BlogService {
	Blog saveBlog(Blog blog);

	List<Blog> getAllBlogs();

	Blog getBlogById(Integer blogID);

	Blog updateBlog(Blog blog, Integer blogID);

	void deleteBlog(Integer blogID);

}
