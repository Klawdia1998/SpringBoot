package com.itmentor.springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "name")
    @Pattern(regexp = "[A-Za-z]{2,15}", message = "Name should be between 2 and 15 latin characters")
    private String name;

    @Column(name = "surname")
    @Pattern(regexp = "[A-Za-z]{2,15}", message = "Surname should be between 2 and 15 latin characters")
    private String surname;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be >= 0")
    @Max(value = 127, message = "Age should be < 128")
    private byte age;

    @Column(name = "email")
    @Email(message = "Enter correct email")
    private String email;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
               "userId=" + userId +
               ", name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", age=" + age +
               ", email='" + email + '\'' +
               '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}