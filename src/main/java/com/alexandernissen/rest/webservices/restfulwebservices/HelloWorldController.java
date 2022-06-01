package com.alexandernissen.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloWorldController {
  String message;

  // Alternatively: @GetRequest(method = RequestMethod.GET, path = "/hello-world")
  @GetMapping(path = "/hello-world")
  public String HelloWorld() {
    return "Hello, World!";
  }

  @GetMapping(path = "/hello-world-bean")
  public HelloWorldBean HelloWorldBean() {
    return new HelloWorldBean("Hello, World!");
  }

  @GetMapping(path = "hello-world/path-variable/{name}")
  public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
    return new HelloWorldBean(String.format("Hello, %s", name));
  }
}
