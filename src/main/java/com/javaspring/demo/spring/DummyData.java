package com.javaspring.demo.spring;

import com.javaspring.demo.spring.model.Movie;
import com.javaspring.demo.spring.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {

    private final MovieRepository movieRepository;

    public DummyData(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie("Sherlock Holmes","2014");
        Movie movie1 = new Movie("Baby Driver","2018");

        movieRepository.save(movie);
        movieRepository.save(movie1);
    }

}
