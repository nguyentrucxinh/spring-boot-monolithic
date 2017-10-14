package com.github.nguyentrucxinh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Provides all the data access behaviors exposed by {@link JpaRepository}
 * and additional custom behaviors may be defined in this interface.
 *
 * @param <T>  the entity
 * @param <ID> the primary key
 * @author Xinh Nguyen
 */
@NoRepositoryBean
interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
}
