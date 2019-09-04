package com.javaspring.demo.spring.model;

import javax.persistence.*;

@Entity
@Table(name="actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Actor(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
