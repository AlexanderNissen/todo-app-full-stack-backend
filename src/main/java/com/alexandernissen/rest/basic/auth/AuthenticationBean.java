package com.alexandernissen.rest.basic.auth;

public class AuthenticationBean {
    private String message;

    public AuthenticationBean(String message) {
        this.message = message;
    }

    public void setMessage() {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return String.format("AuthenticationBean [message=%s]", message);
    }
}
