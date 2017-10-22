package com.github.nguyentrucxinh.domain;

import com.fasterxml.jackson.annotation.JsonView;
import com.github.nguyentrucxinh.helper.util.Views;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
public class Hotel implements Serializable {

    @JsonView(Views.Public.class)
    @Id
    @GeneratedValue
    private Long id;

    @JsonView(Views.Public.class)
    @Column(unique = true)
    @NotNull
    private String name;

    @JsonView(Views.Internal.class)
    @Column
    private Integer classification;

    @JsonView(Views.Internal.class)
    @Column
    private boolean open;

}
