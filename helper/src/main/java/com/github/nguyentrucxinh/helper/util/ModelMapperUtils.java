package com.github.nguyentrucxinh.helper.util;

import org.modelmapper.TypeToken;
import org.springframework.data.domain.Page;

import java.lang.reflect.Type;
import java.util.List;

public class ModelMapperUtils {

    private ModelMapperUtils() {
    }

    public static <T> Type listType(Class<T> type) {
        return new TypeToken<List<T>>() {}.getType();
    }

    public static <T> Type pageType(Class<T> type) {
        return new TypeToken<Page<T>>() {}.getType();
    }
}
