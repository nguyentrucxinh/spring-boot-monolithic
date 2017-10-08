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
    public Permission one(@PathVariable Long id) {
        return permissionService.one(id);
    }

    @PostMapping
    @Override
    public Long createOne(@RequestBody Permission permission) {
        return permissionService.createOne(permission);
    }

    @PutMapping("/{id}")
    @Override
    public void updateOne(@PathVariable Long id, @RequestBody Permission permission) {
        permissionService.updateOne(id, permission);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteOne(@PathVariable Long id) {
        permissionService.deleteOne(id);
    }

    @PatchMapping("/{id}")
    @Override
    public void deactivateOne(@PathVariable Long id) {

    }
}
