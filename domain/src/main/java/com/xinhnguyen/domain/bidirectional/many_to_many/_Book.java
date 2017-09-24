//package com.xinhnguyen.domain.bidirectional.many_to_many;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.List;
//
///**
// * Unidirectional
// * Collection Valued Mappings
// * Demo @OneToMany
// */
//@Entity
//public class _Book implements Serializable {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column
//    private String name;
//
//    @OneToMany(mappedBy = "_book_mark")
//    private List<_BookMark> bookMarks;
//
//    public _Book() {
//    }
//
//    public _Book(String name, List<_BookMark> bookMarks) {
//        this.name = name;
//        this.bookMarks = bookMarks;
//    }
//
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
//    public List<_BookMark> getBookMarks() {
//        return bookMarks;
//    }
//
//    public void setBookMarks(List<_BookMark> bookMarks) {
//        this.bookMarks = bookMarks;
//    }
//}
