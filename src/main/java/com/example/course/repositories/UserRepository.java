package com.example.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
