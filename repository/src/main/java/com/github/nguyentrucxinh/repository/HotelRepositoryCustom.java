package com.github.nguyentrucxinh.repository;

import com.github.nguyentrucxinh.domain.Hotel;

import java.util.List;

/**
 * Provides the data access additional custom behaviors for {@link Hotel}
 */
public interface HotelRepositoryCustom {

    /**
     * Do something
     *
     * @param hotel the entity
     */
    void someCustomMethod(Hotel hotel);

    /**
     * Returns list all {@link Hotel}
     * @return the list {@link Hotel}
     */
    List<Hotel> allHotels();
}
