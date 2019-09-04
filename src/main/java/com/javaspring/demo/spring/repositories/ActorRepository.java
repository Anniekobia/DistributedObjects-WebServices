package com.javaspring.demo.spring.repositories;

import com.javaspring.demo.spring.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ActorRepository extends JpaRepository<Actor,Long> {
}
