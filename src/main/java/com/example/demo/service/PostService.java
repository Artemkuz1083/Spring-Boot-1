package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){

        List<Post> list = new ArrayList<>();
        list.add(new Post("Привет",new Date()));
        list.add(new Post("Я", new Date()));
        list.add(new Post("CrazyTema", new Date()));
        return list;
    }
}
