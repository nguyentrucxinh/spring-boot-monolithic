package com.github.nguyentrucxinh.repository;

import com.github.nguyentrucxinh.domain.Hotel;
import org.springframework.stereotype.Repository;

/**
 * Provides all the data access behaviors for {@link Hotel}
 */
@Repository
public interface HotelRepository extends BaseRepository<Hotel, Long>, HotelRepositoryCustom {
}
