package com.alexandernissen.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
  String message;

  // Alternatively: @GetRequest(method = RequestMethod.GET, path = "/hello-world")
  @GetMapping(path = "/hello-world")
  public String HelloWorld() {
    return "Hello from the backend, World!";
  }

  @GetMapping(path = "/hello-world-bean")
  public HelloWorldBean HelloWorldBean() {
    return new HelloWorldBean("Hello from the backend, BeanWorld!");
  }

  @GetMapping(path = "hello-world/path-variable/{name}")
  public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
    if (name.equals("Error")) {
      throw new RuntimeException("An error was thrown from the server!");
    } else {
      return new HelloWorldBean(String.format("Hello from the backend, %s", name));
    }
  }
}
