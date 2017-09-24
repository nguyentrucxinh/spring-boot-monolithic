package com.xinhnguyen.domain.unidirectional.many_to_many;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Unidirectional
 * Collection Valued Mappings
 * Demo @ManyToMany
 */
@Entity
public class Member implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(name = "member_club",
            joinColumns = @JoinColumn(name = "member_id"),
            inverseJoinColumns = @JoinColumn(name = "club_id"))
    private List<Club> clubs;

    public Member() {
    }

    public Member(String name, List<Club> clubs) {
        this.name = name;
        this.clubs = clubs;
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

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }
}
