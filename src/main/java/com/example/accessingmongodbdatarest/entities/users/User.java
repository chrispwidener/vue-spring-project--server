package com.example.accessingmongodbdatarest.entities.users;

import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.annotation.Id;

public class User {

    @Id private String id;

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonIgnore
    public String getFullName() {
        String fullName = this.firstName + " " + this.lastName;
        return fullName;
    }
}