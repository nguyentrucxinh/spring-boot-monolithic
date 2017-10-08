package com.xinhnguyen.web.controller;

import com.xinhnguyen.domain.User;
import com.xinhnguyen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController implements BaseController<User, Long> {

    @Autowired
    private UserService userService;

    @GetMapping("/paging")
    @Override
    public Page<User> all(Pageable pageable) {
        return null;
    }

    @GetMapping
    @Override
    public List<User> all() {
        return userService.all();
    }

    @GetMapping("/{id}")
    @Override
    public User one(@PathVariable Long id) {
        return userService.one(id);
    }

    @PostMapping
    @Override
    public Long createOne(@RequestBody User user) {
        return userService.createOne(user);
    }

    @PutMapping("/{id}")
    @Override
    public void updateOne(@PathVariable Long id, @RequestBody User user) {
        userService.updateOne(id, user);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteOne(@PathVariable Long id) {
        userService.deleteOne(id);
    }

    @PatchMapping("/{id}")
    @Override
    public void deactivateOne(@PathVariable Long id) {

    }
}
