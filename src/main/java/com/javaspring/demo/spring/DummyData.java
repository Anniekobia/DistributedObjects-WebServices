//package com.javaspring.demo.spring;
//
//import com.javaspring.demo.spring.model.Category;
//import com.javaspring.demo.spring.model.Movie;
//import com.javaspring.demo.spring.repositories.CategoryRepository;
//import com.javaspring.demo.spring.repositories.MovieRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DummyData implements CommandLineRunner {
//
//    private final MovieRepository movieRepository;
//    private final CategoryRepository categoryRepository;
//
//    public DummyData(MovieRepository movieRepository, CategoryRepository categoryRepository) {
//        this.movieRepository = movieRepository;
//        this.categoryRepository = categoryRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Category category = categoryRepository.save(new Category("Comedy"));
//        Category category1 = categoryRepository.save(new Category("Thriller"));
//
//
//
//        Movie movie = new Movie("Dumb and Dumber", "2019");
//        movieRepository.save(movie);
//        category.addMovie(movie);
//        categoryRepository.save(category);
//
//
//        Movie movie1 = new Movie("The Cleverest", "2007");
//        movieRepository.save(movie1);
//        category1.addMovie(movie1);
//        categoryRepository.save(category1);
//    }
//
//}
