package com.xinhnguyen.repository;

import com.xinhnguyen.domain.Hotel;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends BaseRepository<Hotel, Long>, HotelRepositoryCustom {
}
