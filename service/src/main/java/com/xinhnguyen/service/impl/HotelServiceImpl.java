package com.xinhnguyen.service.impl;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.persistence.repository.HotelRepository;
import com.xinhnguyen.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> all() {
        return hotelRepository.findAll();
    }
}
