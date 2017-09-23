package com.xinhnguyen.web.interfaces;

import java.util.List;

public interface ControllerInterface<T> {
    List<T> all();

    T one(Long id);

    Long createOne(T t);

    void updateOne(Long id, T t);

    void deleteOne(Long id);

    void deactivateOne(Long id);
}