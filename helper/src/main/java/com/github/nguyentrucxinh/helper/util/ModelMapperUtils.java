package com.github.nguyentrucxinh.helper.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Defines all behaviors support for ModelMapper
 *
 * @author Xinh Nguyen
 */
public class ModelMapperUtils {

    private ModelMapperUtils() {
    }

    public static <T> Type listType(Class<T> type) {
        return new TypeToken<List<T>>() {}.getType();
    }

    public static <T> Type pageType(Class<T> type) {
        return new TypeToken<Page<T>>() {}.getType();
    }

    public static <A, B> Page<B> toPage(Page<A> pageA, Class<B> clazzB) {
        ModelMapper modelMapper = new ModelMapper();
        return pageA.map(a -> modelMapper.map(a, clazzB));
    }
}
