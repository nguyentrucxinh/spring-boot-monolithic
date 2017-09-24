//package com.xinhnguyen.domain.bidirectional.many_to_many;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
///**
// * Unidirectional
// * Collection Valued Mappings
// * Demo @OneToMany
// */
//@Entity
//public class _BookMark implements Serializable {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column
//    private String name;
//
//    @ManyToOne
//    @JoinColumn(name = "_book_id")
//    private _Book _book;
//
//    public _BookMark() {
//    }
//
//    public _BookMark(String name, _Book _book) {
//        this.name = name;
//        this._book = _book;
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
//    public _Book get_book() {
//        return _book;
//    }
//
//    public void set_book(_Book _book) {
//        this._book = _book;
//    }
//}
