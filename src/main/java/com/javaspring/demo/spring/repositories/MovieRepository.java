package com.javaspring.demo.spring.repositories;

import com.javaspring.demo.spring.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}
