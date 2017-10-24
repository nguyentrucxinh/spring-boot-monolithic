package com.github.nguyentrucxinh.service.impl;

import com.github.nguyentrucxinh.domain.User;
import com.github.nguyentrucxinh.dto.UserDto;
import com.github.nguyentrucxinh.helper.exception.DTOInServiceNotValidException;
import com.github.nguyentrucxinh.helper.response.ExceptionDetailMessage;
import com.github.nguyentrucxinh.helper.util.ListParameterizedType;
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
    public Page<UserDto> findAll(Pageable pageable) {
        Page<User> users = userRepository.findAll(pageable);
        return users.map(user -> modelMapper.map(user, UserDto.class));
    }

    @Override
    public List<UserDto> findAll() {
        List<User> users = userRepository.findAll();
        return modelMapper.map(users, new ListParameterizedType(UserDto.class));
    }

    @Override
    public UserDto findById(Long id) {
        // Validate User Id
        List<ExceptionDetailMessage> exceptionDetailMessages = userValidation.isValidateUserId(id);
        if (!exceptionDetailMessages.isEmpty())
            throw new DTOInServiceNotValidException(exceptionDetailMessages);

        User user = userRepository.findOne(id);
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public Long create(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return userRepository.save(user).getId();
    }

    @Override
    public void update(Long id, UserDto userDto) {
        // Validate User Id
        List<ExceptionDetailMessage> exceptionDetailMessages = userValidation.isValidateUserId(id);
        if (!exceptionDetailMessages.isEmpty())
            throw new DTOInServiceNotValidException(exceptionDetailMessages);

        User user = userRepository.findOne(id);
        user.setLastName(userDto.getLastName());
        user.setFirstName(userDto.getFirstName());
        userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        // Validate User Id
        List<ExceptionDetailMessage> exceptionDetailMessages = userValidation.isValidateUserId(id);
        if (!exceptionDetailMessages.isEmpty())
            throw new DTOInServiceNotValidException(exceptionDetailMessages);

        userRepository.delete(id);
    }
}
