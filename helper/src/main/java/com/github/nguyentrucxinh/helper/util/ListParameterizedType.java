package com.github.nguyentrucxinh.helper.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class ListParameterizedType implements ParameterizedType {

    private Type type;

    public ListParameterizedType(Type type) {
        this.type = type;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{type};
    }

    @Override
    public Type getRawType() {
        return List.class;
        // return ArrayList.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }

    // implement equals method too! (as per javadoc)
}
