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
//public class _Person implements Serializable {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column
//    private String name;
//
//    @OneToOne
//    @JoinColumn(name = "_job_id")
//    private _Job _job;
//
//    public _Person() {
//    }
//
//    public _Person(String name, _Job _job) {
//        this.name = name;
//        this._job = _job;
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
//    public _Job get_job() {
//        return _job;
//    }
//
//    public void set_job(_Job _job) {
//        this._job = _job;
//    }
//}
