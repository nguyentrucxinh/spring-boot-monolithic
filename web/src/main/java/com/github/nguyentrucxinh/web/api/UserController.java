package com.github.nguyentrucxinh.web.api;

import com.github.nguyentrucxinh.dto.UserDTO;
import com.github.nguyentrucxinh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController implements BaseController<UserDTO, Long> {

    @Autowired
    private UserService userService;

    @GetMapping
    @Override
    public Page<UserDTO> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @Override
    public Long create(UserDTO userDTO, BindingResult bindingResult) {
        return null;
    }

    @Override
    public void update(Long id, UserDTO userDTO, BindingResult bindingResult) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
