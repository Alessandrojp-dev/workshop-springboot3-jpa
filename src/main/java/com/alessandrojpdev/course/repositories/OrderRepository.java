package com.alessandrojpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrojpdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
