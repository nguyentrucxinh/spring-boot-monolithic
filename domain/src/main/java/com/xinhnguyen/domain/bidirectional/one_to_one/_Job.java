//package com.xinhnguyen.domain.bidirectional.one_to_one;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
///**
// * Unidirectional
// * Single Valued Mappings
// * Demo @OneToOne
// */
//@Entity
//public class _Job implements Serializable {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column
//    private String name;
//
//    @OneToOne(mappedBy = "_job"/*, cascade = CascadeType.ALL, fetch = FetchType.LAZY*/)
//    private _Person _person;
//
//    public _Job() {
//    }
//
//    public _Job(String name, _Person person) {
//        this.name = name;
//        this._person = person;
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
//    public _Person getPerson() {
//        return _person;
//    }
//
//    public void setPerson(_Person person) {
//        this._person = person;
//    }
//}
