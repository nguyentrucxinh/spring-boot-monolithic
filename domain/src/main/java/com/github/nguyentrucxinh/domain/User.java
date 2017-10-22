package com.github.nguyentrucxinh.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "users")
public class User extends BaseEntityAudit {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String username;

    @Column
    private String password;

    @Column
    private String passwordSalt;

    @Column
    private String firstName;

    @Column
    private String lastName;

}
