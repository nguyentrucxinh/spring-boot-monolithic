package com.github.nguyentrucxinh.domain;

import com.fasterxml.jackson.annotation.JsonView;
import com.github.nguyentrucxinh.helper.util.Views;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "hotels")
public class Hotel implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @Column
    private Integer classification;

    @Column
    private boolean open;

}
