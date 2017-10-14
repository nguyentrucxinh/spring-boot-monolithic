package com.github.nguyentrucxinh.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
@AttributeOverride(name = "id", column = @Column(name = "customer_id",
        nullable = false, columnDefinition = "BIGINT UNSIGNED"))
public class Customer extends BaseEntityAudit {

    // fields without id column ...

    public Customer() {
    }

    // getter and setter ...

}
