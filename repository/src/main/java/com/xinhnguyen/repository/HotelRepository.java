package com.xinhnguyen.repository;

import com.xinhnguyen.domain.Hotel;
import org.springframework.stereotype.Repository;

/**
 * Provides all the data access behaviors for {@link Hotel}
 */
@Repository
public interface HotelRepository extends BaseRepository<Hotel, Long>, HotelRepositoryCustom {
}
