package com.github.nguyentrucxinh.service.impl;

import com.github.nguyentrucxinh.domain.Hotel;
import com.github.nguyentrucxinh.repository.HotelRepository;
import com.github.nguyentrucxinh.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Page<Hotel> findAll(Pageable pageable) {
        return hotelRepository.findAll(pageable);
    }

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel findById(Long id) {
        return hotelRepository.findOne(id);
    }

    @Override
    public Long create(Hotel hotel) {
        return hotelRepository.save(hotel).getId();
    }

    @Override
    public void update(Long id, Hotel hotel) {
        hotel.setId(id);
        hotelRepository.save(hotel);
    }

    @Override
    public void deleteById(Long id) {
        hotelRepository.delete(hotelRepository.findOne(id));
    }
}
