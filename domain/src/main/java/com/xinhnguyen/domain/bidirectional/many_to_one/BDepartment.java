//package com.xinhnguyen.domain.bidirectional.many_to_one;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.List;
//
///**
// * Bidirectional
// * Single Valued Mappings
// * Demo @ManyToOne
// */
//@Entity
//public class BDepartment implements Serializable {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column
//    private String name;
//
//    @OneToMany
//    private List<BEmployee> bEmployees;
//
//    public BDepartment() {
//    }
//
//    public BDepartment(String name, List<BEmployee> bEmployees) {
//        this.name = name;
//        this.bEmployees = bEmployees;
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
//    public List<BEmployee> getbEmployees() {
//        return bEmployees;
//    }
//
//    public void setbEmployees(List<BEmployee> bEmployees) {
//        this.bEmployees = bEmployees;
//    }
//}
