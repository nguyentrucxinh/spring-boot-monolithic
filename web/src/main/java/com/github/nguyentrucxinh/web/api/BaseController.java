package com.github.nguyentrucxinh.web.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;

import java.io.Serializable;
import java.util.List;

/**
 * Defines all base behaviors for {@code RESTFUL web service} operations
 *
 * @param <T>  the entity
 * @param <ID> the primary key
 * @author Xinh Nguyen
 */
public interface BaseController<T, ID extends Serializable> {

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
    ID create(T t, BindingResult bindingResult);

    /**
     * Update an entity
     *
     * @param id the primary key
     * @param t  the entity should be updated
     */
    void update(ID id, T t, BindingResult bindingResult);

    /**
     * Delete an entity
     *
     * @param id the primary key
     */
    void deleteById(ID id);
}
