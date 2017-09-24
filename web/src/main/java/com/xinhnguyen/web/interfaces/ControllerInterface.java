package com.xinhnguyen.web.interfaces;

import java.io.Serializable;
import java.util.List;

public interface ControllerInterface<T, ID extends Serializable> {
    List<T> all();

    T one(ID id);

    Long createOne(T t);

    void updateOne(ID id, T t);

    void deleteOne(ID id);

    void deactivateOne(ID id);
}