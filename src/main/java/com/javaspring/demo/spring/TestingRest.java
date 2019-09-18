package com.javaspring.demo.spring;

import com.javaspring.demo.FeignRestClient;
import com.javaspring.demo.spring.model.Movie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Movie>> response = restTemplate.exchange("http://10.51.10.111:9090/movies", HttpMethod.GET, null, new ParameterizedTypeReference<List<Movie>>() {
        });
        List<Movie> movies = response.getBody();
        System.err.println(movies.toString());

        Movie newMovie = new Movie("Why", "2019");
        newMovie = feignRestClient.createMovie(newMovie);
        System.out.println("Created Movie: " + newMovie.toString());

        movies = feignRestClient.getAllMovies();
        System.out.println(movies);

        newMovie.setName("Why are you running");
        newMovie = feignRestClient.updateMovie(newMovie.getId(),newMovie);
        System.out.println("Updated Movie: " + newMovie.toString());

        Movie movie = restTemplate.getForObject("http://10.51.10.111:9090/movies/3", Movie.class);
        System.err.println(movie.toString());

        String url = "http://10.51.10.111:9090/movies/search?name=" + movie.getName();
        Movie movieByName = restTemplate.getForObject(url, Movie.class);
        System.err.println(movieByName.toString());
    }
}
