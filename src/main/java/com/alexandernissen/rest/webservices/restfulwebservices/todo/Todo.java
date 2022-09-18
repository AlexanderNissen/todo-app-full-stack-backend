package com.alexandernissen.rest.webservices.restfulwebservices.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Todo {

  @Id
  @GeneratedValue
  private Long id;
  private String username;
  private String description;
  private Date targetDate;
  private boolean isDone;

  protected Todo() {
    // Empty constructor necessary to be able to update using put request
  }
  
  public Todo(Long id, String username, String description, Date targetDate, boolean isDone) {
    super();
    this.id = id;
    this.username = username;
    this.description = description;
    this.targetDate = targetDate;
    this.isDone = isDone;
  }
  
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getTargetDate() {
    return this.targetDate;
  }

  public void setTargetDate(Date targetDate) {
    this.targetDate = targetDate;
  }
  
  public boolean isIsDone() {
    return this.isDone;
  }

  public boolean getIsDone() {
    return this.isDone;
  }
  
  public void setIsDone(boolean isDone) {
    this.isDone = isDone;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if(getClass() != obj.getClass()) {
      return false;
    }
    Todo other = (Todo) obj;
    if (id != other.id) {
      return false;
    }
    return true;
  }
  
}
