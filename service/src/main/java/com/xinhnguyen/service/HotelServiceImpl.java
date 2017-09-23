package com.xinhnguyen.service;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.persistence.HotelRepository;
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
