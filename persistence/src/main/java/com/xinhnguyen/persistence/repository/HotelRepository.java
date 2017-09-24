package com.xinhnguyen.persistence.repository;

import com.xinhnguyen.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends BaseRepository<Hotel, Long>, HotelRepositoryCustom {
}
