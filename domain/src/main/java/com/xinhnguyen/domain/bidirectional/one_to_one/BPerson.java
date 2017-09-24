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
//public class BPerson implements Serializable {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column
//    private String name;
//
//    @OneToOne(mappedBy = "job")
//    private BJob job;
//
//    public BPerson() {
//    }
//
//    public BPerson(String name, BJob job) {
//        this.name = name;
//        this.job = job;
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
//    public BJob getJob() {
//        return job;
//    }
//
//    public void setJob(BJob job) {
//        this.job = job;
//    }
//}
