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
//public class BJob implements Serializable {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column
//    private String name;
//
//    public BJob() {
//    }
//
//    public BJob(String name) {
//        this.name = name;
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
//}
