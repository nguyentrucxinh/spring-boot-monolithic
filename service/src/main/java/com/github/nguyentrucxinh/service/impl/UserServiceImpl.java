package com.github.nguyentrucxinh.service.impl;

import com.github.nguyentrucxinh.dto.UserDTO;
import com.github.nguyentrucxinh.repository.UserRepository;
import com.github.nguyentrucxinh.service.UserService;
import com.github.nguyentrucxinh.service.validation.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private UserValidation userValidation;

    @Override
    public Page<UserDTO> findAll(Pageable pageable) {
//        return userRepository.findAll(pageable);
        return null;
    }

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public UserDTO findById(Long id) {
        return null;
    }

    @Override
    public Long create(UserDTO userDTO) {
        return null;
    }

    @Override
    public void update(Long id, UserDTO userDTO) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
