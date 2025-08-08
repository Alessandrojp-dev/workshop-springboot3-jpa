package com.alessandrojpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrojpdev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
