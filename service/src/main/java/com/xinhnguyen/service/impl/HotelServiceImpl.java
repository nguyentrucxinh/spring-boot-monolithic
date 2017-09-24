package com.xinhnguyen.service.impl;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.persistence.repository.HotelRepository;
import com.xinhnguyen.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Page<Hotel> all(Pageable pageable) {
        return hotelRepository.findAll(pageable);
    }

    @Override
    public List<Hotel> all() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel one(Long id) {
        return hotelRepository.findOne(id);
    }

    @Override
    public Long createOne(Hotel hotel) {
        return hotelRepository.save(hotel).getId();
    }

    @Override
    public void updateOne(Long id, Hotel hotel) {
        hotel.setId(id);
        hotelRepository.save(hotel);
    }

    @Override
    public void deleteOne(Long id) {
        hotelRepository.delete(hotelRepository.findOne(id));
    }

    @Override
    public void deactivateOne(Long id) {

    }
}
