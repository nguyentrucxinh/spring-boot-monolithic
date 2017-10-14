package com.github.nguyentrucxinh.repository.impl;

import com.github.nguyentrucxinh.domain.Hotel;
import com.github.nguyentrucxinh.repository.HotelRepository;
import com.github.nguyentrucxinh.repository.HotelRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class HotelRepositoryImpl implements HotelRepositoryCustom {

    /* Optional - if you need it */
    @Autowired
    private HotelRepository hotelRepository;

    @PersistenceContext
    private EntityManager em;

    @Override
    public void someCustomMethod(Hotel hotel) {
        // Your custom implementation
    }
}
