package com.booklib.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message="Please Enter your name")
    private String name;

    @Column(nullable = false, length = 50)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message="Please Enter your name")
    private String surname;

    @Column(unique = true)
    @Email(message = "{user.email.invalid}")
    @NotEmpty(message="Please Enter your email")
    private String email;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false)
    @NotEmpty(message="Please Enter Date Registration")
    private Date date_registr;

    @Column(nullable = false)
    @NotEmpty(message="Please Enter Date of Birth")
    private Date birthday;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Set<UserRole> roles;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
}