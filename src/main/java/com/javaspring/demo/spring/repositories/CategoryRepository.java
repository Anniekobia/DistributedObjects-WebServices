package com.javaspring.demo.spring.repositories;

import com.javaspring.demo.spring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
