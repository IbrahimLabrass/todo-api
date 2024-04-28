package com.ibrahim.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibrahim.todo.models.Todo;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findTodoByCategoryId(Long categoryId);
}