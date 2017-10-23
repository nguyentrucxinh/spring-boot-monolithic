package com.github.nguyentrucxinh.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel extends BaseEntityAudit {

    @Column(unique = true)
    private String name;

    @Column
    private Integer classification;

    @Column
    private boolean open;

}
