package com.xinhnguyen.service;

import com.xinhnguyen.domain.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HotelService {

    Page<Hotel> all(Pageable pageable);

    List<Hotel> all();

    Hotel one(Long id);

    Long createOne(Hotel hotel);

    void updateOne(Long id, Hotel hotel);

    void deleteOne(Long id);

    void deactivateOne(Long id);
}
