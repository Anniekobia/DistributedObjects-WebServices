package com.javaspring.demo.spring.service;

import com.javaspring.demo.spring.model.Actor;
import com.javaspring.demo.spring.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(Long id);

    Movie create(Movie movie);

    void delete(Long id);

    Movie update(Movie movie);

    Movie update(Long id,Movie movie);

    Actor createActor(Long id, Actor actor);
}
