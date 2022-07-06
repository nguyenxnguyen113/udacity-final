package com.example.demo.model.requests;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;

public class CreateUserRequest {

  @JsonProperty
  @NotEmpty
  private String username;

  @NotEmpty
  private String password;

  @NotEmpty
  private String confirmPassword;

  public String getUsername() {
    return username;
  }
  public String getPassword() {
    return password;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }
  public String getConfirmPassword() {
    return confirmPassword;
  }



}
