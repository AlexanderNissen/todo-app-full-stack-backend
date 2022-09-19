package com.alexandernissen.rest.webservices.restfulwebservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoJpaResource {

  @Autowired
  private TodoJpaRepository todoJpaRepository;
  
  @GetMapping(path = "/jpa/users/{username}/todos")
  public List<Todo> getAllTodos(@PathVariable String username) {
      return todoJpaRepository.findByUsername(username);
  }

  @GetMapping(path = "/jpa/users/{username}/todos/{id}")
  public Todo getTodo(@PathVariable String username, @PathVariable long id) {
      return todoJpaRepository.findById(id).get();
  }
}
