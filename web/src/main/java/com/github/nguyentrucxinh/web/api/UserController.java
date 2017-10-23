package com.github.nguyentrucxinh.web.api;

import com.github.nguyentrucxinh.dto.UserDto;
import com.github.nguyentrucxinh.helper.exception.DTOInControllerNotValidException;
import com.github.nguyentrucxinh.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@Validated
public class UserController implements BaseController<UserDto, Long> {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "${UserController.findAllPaging.title}", notes = "${UserController.findAllPaging.notes}")
    @GetMapping("/paging")
    @Override
    public Page<UserDto> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @ApiOperation(value = "${UserController.findAll.title}", notes = "${UserController.findAll.notes}")
    @GetMapping
    @Override
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @ApiOperation(value = "${UserController.findById.title}", notes = "${UserController.findById.notes}")
    @GetMapping("/{id}")
    @Override
    public UserDto findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @ApiOperation(value = "${UserController.create.title}", notes = "${UserController.create.notes}")
    @PostMapping
    @Override
    public Long create(@Validated @RequestBody UserDto userDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            throw new DTOInControllerNotValidException(bindingResult);
        return userService.create(userDTO);
    }

    @ApiOperation(value = "${UserController.update.title}", notes = "${UserController.update.notes}")
    @PutMapping("/{id}")
    @Override
    public void update(@PathVariable Long id, @Validated @RequestBody UserDto userDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            throw new DTOInControllerNotValidException(bindingResult);
        userService.update(id, userDTO);
    }

    @ApiOperation(value = "${UserController.delete.title}", notes = "${UserController.delete.notes}")
    @DeleteMapping("/{id}")
    @Override
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
