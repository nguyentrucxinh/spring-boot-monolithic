package com.xinhnguyen.repository.impl;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.repository.HotelRepository;
import com.xinhnguyen.repository.HotelRepositoryCustom;
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
