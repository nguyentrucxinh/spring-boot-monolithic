package com.xinhnguyen.web.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface ControllerInterface<T, ID extends Serializable> {
    Page<T> all(Pageable pageable);

    List<T> all();

    T one(ID id);

    Long createOne(T t);

    void updateOne(ID id, T t);

    void deleteOne(ID id);

    void deactivateOne(ID id);
}