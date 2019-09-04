package com.javaspring.demo.spring.service;

import com.javaspring.demo.spring.model.Actor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    @Override
    public List<Actor> findAll() {
        return null;
    }

    @Override
    public Actor findById(Long id) {
        return null;
    }

    @Override
    public Actor create(Actor actor) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Actor update(Actor actor) {
        return null;
    }

    @Override
    public Actor update(Long id, Actor actor) {
        return null;
    }
}
