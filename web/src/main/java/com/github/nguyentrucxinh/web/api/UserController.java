package com.github.nguyentrucxinh.web.api;

import com.github.nguyentrucxinh.dto.UserDto;
import com.github.nguyentrucxinh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController implements BaseController<UserDto, Long> {

    @Autowired
    private UserService userService;

    @GetMapping("/paging")
    @Override
    public Page<UserDto> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @GetMapping
    @Override
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    @Override
    public UserDto findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    @Override
    public Long create(UserDto userDTO, BindingResult bindingResult) {
        return userService.create(userDTO);
    }

    @PutMapping("/{id}")
    @Override
    public void update(Long id, UserDto userDTO, BindingResult bindingResult) {
        userService.update(id, userDTO);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteById(Long id) {
        userService.deleteById(id);
    }
}
