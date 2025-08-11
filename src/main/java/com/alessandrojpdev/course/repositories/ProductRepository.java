package com.alessandrojpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrojpdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
