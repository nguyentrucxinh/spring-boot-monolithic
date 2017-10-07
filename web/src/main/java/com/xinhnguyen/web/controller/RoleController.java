package com.xinhnguyen.web.controller;

import com.xinhnguyen.domain.Role;
import com.xinhnguyen.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController implements BaseController<Role, Long> {

    @Autowired
    private RoleService roleService;

    @GetMapping("/paging")
    @Override
    public Page<Role> all(Pageable pageable) {
        return null;
    }

    @GetMapping
    @Override
    public List<Role> all() {
        return roleService.all();
    }

    @GetMapping("/{id}")
    @Override
    public Role one(@PathVariable Long aLong) {
        return roleService.one(aLong);
    }

    @PostMapping
    @Override
    public Long createOne(@RequestBody Role role) {
        return roleService.createOne(role);
    }

    @PutMapping("/{id}")
    @Override
    public void updateOne(@PathVariable Long aLong, @RequestBody Role role) {
        roleService.updateOne(aLong, role);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteOne(@PathVariable Long aLong) {
        roleService.deleteOne(aLong);
    }

    @PatchMapping("/{id}")
    @Override
    public void deactivateOne(@PathVariable Long aLong) {

    }
}
