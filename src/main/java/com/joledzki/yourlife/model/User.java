package com.joledzki.yourlife.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Setter @Getter @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @Min(value = 6, message = "Email is mandatory")
    private String email;

    @Min(value = 6, message = "Password is mandatory")
    private String password;

    @Size(min = 2, max = 32, message = "Firstname is mandatory")
    private String firstname;

    @Size(min = 2, max = 32, message = "Lastname is mandatory")
    private String lastname;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
