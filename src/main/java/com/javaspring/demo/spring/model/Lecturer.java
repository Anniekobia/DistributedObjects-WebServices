package com.javaspring.demo.spring.model;

import com.sun.xml.internal.ws.developer.Serialization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Lecturer {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    private Lecturer(){

    }
    public Lecturer(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Lecturer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
