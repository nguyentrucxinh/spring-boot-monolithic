//package com.xinhnguyen.domain.bidirectional;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import java.io.Serializable;
//
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
