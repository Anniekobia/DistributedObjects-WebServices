package com.javaspring.demo.spring.model;

import javax.persistence.*;

@Entity
@Table(name="actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "movie_id_fk")
    private Movie movie;

    public Actor(Long id, String name, Movie movie) {
        this.id = id;
        this.name = name;
        this.movie=movie;
    }

    private Actor(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
