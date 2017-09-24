package com.xinhnguyen.persistence.repository.impl;

import com.xinhnguyen.persistence.repository.HotelRepository;
import com.xinhnguyen.persistence.repository.HotelRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class HotelRepositoryImp implements HotelRepositoryCustom {

    /* Optional - if you need it */
    @Autowired
    private HotelRepository hotelRepository;

    @PersistenceContext
    private EntityManager em;
    
}
