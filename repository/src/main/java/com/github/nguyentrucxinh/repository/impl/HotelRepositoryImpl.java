package com.github.nguyentrucxinh.repository.impl;

import com.github.nguyentrucxinh.domain.Hotel;
import com.github.nguyentrucxinh.repository.HotelRepository;
import com.github.nguyentrucxinh.repository.HotelRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

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

    @Override
    public List<Hotel> allHotels() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Hotel> cq = cb.createQuery(Hotel.class);
        Root<Hotel> rootEntry = cq.from(Hotel.class);
        CriteriaQuery<Hotel> all = cq.select(rootEntry);
        TypedQuery<Hotel> allQuery = em.createQuery(all);
        return allQuery.getResultList();
    }
}
