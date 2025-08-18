package com.alessandrojpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrojpdev.course.entities.OrderItem;
import com.alessandrojpdev.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
