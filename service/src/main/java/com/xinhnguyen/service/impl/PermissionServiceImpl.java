package com.xinhnguyen.service.impl;

import com.xinhnguyen.domain.Permission;
import com.xinhnguyen.repository.PermissionRepository;
import com.xinhnguyen.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public Page<Permission> all(Pageable pageable) {
        return null;
    }

    @Override
    public List<Permission> all() {
        return permissionRepository.findAll();
    }

    @Override
    public Permission one(Long aLong) {
        return permissionRepository.findOne(aLong);
    }

    @Override
    public Long createOne(Permission permission) {
        return permissionRepository.save(permission).getId();
    }

    @Override
    public void updateOne(Long aLong, Permission permission) {
        Permission found = permissionRepository.findOne(aLong);
        found.setName(permission.getName());
        found.setRole(permission.getRole());
        permissionRepository.save(found);
    }

    @Override
    public void deleteOne(Long aLong) {
        permissionRepository.delete(aLong);
    }

    @Override
    public void deactivateOne(Long aLong) {

    }
}
