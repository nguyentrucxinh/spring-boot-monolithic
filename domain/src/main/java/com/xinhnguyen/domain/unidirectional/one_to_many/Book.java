package com.xinhnguyen.domain.unidirectional.one_to_many;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Unidirectional
 * Collection Valued Mappings
 * Demo @OneToMany
 */
@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @OneToMany
    @JoinColumn(name = "bookId")
    private List<BookMark> bookMarks;

    public Book() {
    }

    public Book(String name, List<BookMark> bookMarks) {
        this.name = name;
        this.bookMarks = bookMarks;
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

    public List<BookMark> getBookMarks() {
        return bookMarks;
    }

    public void setBookMarks(List<BookMark> bookMarks) {
        this.bookMarks = bookMarks;
    }
}
