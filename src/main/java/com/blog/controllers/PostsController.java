package com.blog.controllers;

import com.blog.models.Post;
import com.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostsController {
@Autowired
    private PostService postService;

@RequestMapping("/view/{id}")
    public String postService(@PathVariable("id") Long id, Model model){
    Post post = postService.findById(id);
    model.addAttribute("post", post);
    return "view";
}
}
