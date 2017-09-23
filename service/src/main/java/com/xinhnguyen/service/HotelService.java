package com.xinhnguyen.service;

import com.xinhnguyen.domain.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> all();
    Hotel one(Long id);
    Long createOne(Hotel hotel);
    void updateOne(Long id, Hotel hotel);
    void deleteOne(Long id);
    void deactivateOne(Long id);
}
