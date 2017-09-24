package com.xinhnguyen.persistence.repository;

import com.xinhnguyen.domain.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends BaseRepository<Hotel, Long>, HotelRepositoryCustom {

    Page<Hotel> findAll(Pageable pageable);

    List<Hotel> findAll(Sort sort);
}
