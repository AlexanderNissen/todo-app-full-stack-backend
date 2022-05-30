package com.alexandernissen.rest.webservices.restfulwebservices;

// Definition of Java bean
// 1. Private properties/field with getters and setters
// 2. A no-argument constructor
// 3. Implements the Serializable interface
public class HelloWorldBean {
  private String message;

  // Strictly speaking, a Java bean has a no-argument constructor. Hence, not fully a Java bean at this point.
  public HelloWorldBean(String message) {
    this.message = message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  // Necessary for conversion of message to JSON at our endpoint
  public String getMessage() {
    return this.message;
  }

  @Override
  public String toString() {
    return String.format("HelloWorldBean [message=%s", message);
  }
}
