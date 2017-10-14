package com.github.nguyentrucxinh.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

/**
 * Defines all public business behaviors for operations on the entity model
 *
 * @param <T>  the entity
 * @param <ID> the primary id
 * @author Xinh Nguyen
 */
public interface BaseService<T, ID extends Serializable> {

    /**
     * Find all entity with pagination
     *
     * @param pageable the pagination
     * @return the list entity
     */
    Page<T> findAll(Pageable pageable);

    /**
     * Find all entity
     *
     * @return the list entity
     */
    List<T> findAll();

    /**
     * Find an entity by the primary key
     *
     * @param id the primary key
     * @return an entity
     */
    T findById(ID id);

    /**
     * Create a new entity
     *
     * @param t the entity should be created
     * @return a primary key
     */
    ID create(T t);

    /**
     * Update an entity
     *
     * @param id the primary key
     * @param t  the entity should be updated
     */
    void update(ID id, T t);

    /**
     * Delete an entity
     *
     * @param id the primary key
     */
    void deleteById(ID id);
}
