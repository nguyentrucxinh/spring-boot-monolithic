package com.xinhnguyen.service.impl;

import com.xinhnguyen.domain.User;
import com.xinhnguyen.repository.UserRepository;
import com.xinhnguyen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> all(Pageable pageable) {
        return null;
    }

    @Override
    public List<User> all() {
        return userRepository.findAll();
    }

    @Override
    public User one(Long aLong) {
        return userRepository.findOne(aLong);
    }

    @Override
    public Long createOne(User user) {
        return userRepository.save(user).getId();
    }

    @Override
    public void updateOne(Long aLong, User user) {
        User found = userRepository.findOne(aLong);
        found.setName(user.getName());
        found.setPermissions(user.getPermissions());
        found.setRoles(user.getRoles());
        userRepository.save(found);
    }

    @Override
    public void deleteOne(Long aLong) {
        userRepository.delete(aLong);
    }

    @Override
    public void deactivateOne(Long aLong) {

    }
}
