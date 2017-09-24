//package com.xinhnguyen.domain.bidirectional.many_to_one;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
///**
// * Bidirectional
// * Single Valued Mappings
// * Demo @ManyToOne
// */
//@Entity
//public class BEmployee implements Serializable {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column
//    private String name;
//
//    @ManyToOne
//    private BDepartment department;
//
//    public BEmployee() {
//    }
//
//    public BEmployee(String name, BDepartment department) {
//        this.name = name;
//        this.department = department;
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
//    public BDepartment getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(BDepartment department) {
//        this.department = department;
//    }
//}
