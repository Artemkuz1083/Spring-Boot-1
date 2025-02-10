package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){

        List<Post> list = new ArrayList<>();
        list.add(new Post("Привет"));
        list.add(new Post("Я"));
        list.add(new Post("Дуров"));
        return list;
    }
}
