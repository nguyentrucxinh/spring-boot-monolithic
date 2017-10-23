package com.github.nguyentrucxinh.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntityAudit {

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
