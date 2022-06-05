package com.alexandernissen.rest.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TodoResource {

  @Autowired
  private TodoHardcodedService todoService;

  @GetMapping(path = "/users")
  public String test() {
    return "test";
  }
  
  @GetMapping(path = "/users/{username}/todos")
  public List<Todo> getAllTodos(@PathVariable String username) {
    return todoService.findAll();
  }
}
