package com.skateflow.Skateflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminLogin {

    @Id
    private Long id; // Use um identificador único

    private String username;
    private String password; // Considere usar hashing para a senha

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
