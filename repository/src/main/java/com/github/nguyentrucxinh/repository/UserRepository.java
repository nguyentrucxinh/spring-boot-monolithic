package com.github.nguyentrucxinh.repository;

import com.github.nguyentrucxinh.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Provides all the data access behaviors for {@link User}
 */
@Repository
public interface UserRepository extends BaseRepository<User, Long>, UserRepositoryCustom {
}
