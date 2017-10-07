package com.xinhnguyen.web.controller;

import com.xinhnguyen.domain.Permission;
import com.xinhnguyen.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController implements BaseController<Permission, Long> {

    @Autowired
    private PermissionService permissionService;

    @GetMapping("/paging")
    @Override
    public Page<Permission> all(Pageable pageable) {
        return null;
    }

    @GetMapping
    @Override
    public List<Permission> all() {
        return permissionService.all();
    }

    @GetMapping("/{id}")
    @Override
    public Permission one(@PathVariable Long aLong) {
        return permissionService.one(aLong);
    }

    @PostMapping
    @Override
    public Long createOne(@RequestBody Permission permission) {
        return permissionService.createOne(permission);
    }

    @PutMapping("/{id}")
    @Override
    public void updateOne(@PathVariable Long aLong, @RequestBody Permission permission) {
        permissionService.updateOne(aLong, permission);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteOne(@PathVariable Long aLong) {
        permissionService.deleteOne(aLong);
    }

    @PatchMapping("/{id}")
    @Override
    public void deactivateOne(@PathVariable Long aLong) {

    }
}
