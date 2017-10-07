package com.xinhnguyen.service.impl;

import com.xinhnguyen.domain.Role;
import com.xinhnguyen.repository.RoleRepository;
import com.xinhnguyen.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Page<Role> all(Pageable pageable) {
        return null;
    }

    @Override
    public List<Role> all() {
        return roleRepository.findAll();
    }

    @Override
    public Role one(Long aLong) {
        return roleRepository.findOne(aLong);
    }

    @Override
    public Long createOne(Role role) {
        return roleRepository.save(role).getId();
    }

    @Override
    public void updateOne(Long aLong, Role role) {
        Role found = roleRepository.findOne(aLong);
        found.setName(role.getName());
        roleRepository.save(found);
    }

    @Override
    public void deleteOne(Long aLong) {
        roleRepository.delete(aLong);
    }

    @Override
    public void deactivateOne(Long aLong) {

    }
}
