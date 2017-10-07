package com.xinhnguyen.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Permission implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "permissions", cascade = CascadeType.ALL)
    private Set<User> users;

    @ManyToOne
    @JoinTable(name = "role_permission"
            , joinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id")}
            , inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
    private Role role;

    public Permission() {
    }

    public Permission(Long id, String name, Set<User> users, Role role) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
