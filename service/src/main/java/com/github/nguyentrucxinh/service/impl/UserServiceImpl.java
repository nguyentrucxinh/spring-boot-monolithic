package com.github.nguyentrucxinh.service.impl;

import com.github.nguyentrucxinh.domain.User;
import com.github.nguyentrucxinh.dto.UserDTO;
import com.github.nguyentrucxinh.helper.util.ModelMapperUtils;
import com.github.nguyentrucxinh.repository.UserRepository;
import com.github.nguyentrucxinh.service.UserService;
import com.github.nguyentrucxinh.service.validation.UserValidation;
import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Page<UserDTO> findAll(Pageable pageable) {
        Page<User> users = userRepository.findAll(pageable);
        return modelMapper.map(users, ModelMapperUtils.pageType(UserDTO.class));
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        return modelMapper.map(users, ModelMapperUtils.listType(UserDTO.class));
    }

    @Override
    public UserDTO findById(Long id) {
        User user = userRepository.findOne(id);
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public Long create(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return userRepository.save(user).getId();
    }

    @Override
    public void update(Long id, UserDTO userDTO) {
        User user = userRepository.findOne(id);
        user.setLastName(userDTO.getLastName());
        user.setFirstName(userDTO.getFirstName());
        userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.delete(id);
    }
}
