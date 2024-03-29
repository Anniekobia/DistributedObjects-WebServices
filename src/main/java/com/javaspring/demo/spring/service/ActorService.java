package com.javaspring.demo.spring.service;

import com.javaspring.demo.spring.model.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> findAll();

    Actor findById(Long id);

    Actor create(Actor actor);

    void delete(Long id);

    Actor update(Actor actor);

    Actor update(Long id,Actor actor);
}
