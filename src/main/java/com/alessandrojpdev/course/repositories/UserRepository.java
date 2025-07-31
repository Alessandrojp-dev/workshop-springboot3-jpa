package com.alessandrojpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrojpdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
