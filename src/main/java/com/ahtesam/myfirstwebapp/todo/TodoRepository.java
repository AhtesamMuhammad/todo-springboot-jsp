package com.ahtesam.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    // finds by the methode "findBy" + name
    public List<Todo> findByUsername(String username);
}
