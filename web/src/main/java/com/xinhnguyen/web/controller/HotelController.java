package com.xinhnguyen.web.controller;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.service.HotelService;
import com.xinhnguyen.web.annotation.HotelRestController;
import com.xinhnguyen.web.exception.CustomNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;
import java.util.List;

@Api(value = "/api/hotels", description = "Operations about hotels")
//@RestController
//@RequestMapping("/api/hotels")
@HotelRestController
public class HotelController implements BaseController<Hotel, Long> {

    private static Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
//    private static Logger LOGGER = LoggerFactory.getLogger(HotelController.class);

    @Autowired
    private HotelService hotelService;

    @Autowired
    private Environment env;

    @Value("${user.lastname}")
    private String lastname;

    @ApiOperation(value = "View a list of paging hotels", response = Hotel.class)
    @GetMapping("/paging")
    @Override
    public Page<Hotel> all(@PageableDefault(size = 2, page = 1, sort = "name") Pageable pageable) {
        return hotelService.all(pageable);
    }

    @ApiOperation(value = "View a list of hotels", response = Hotel.class)
    @GetMapping
    @Override
    public List<Hotel> all() {
        LOGGER.debug("Debug log message");
        LOGGER.info("Info log message");
        LOGGER.error("Error log message");
        LOGGER.warn("Warn log message");
        LOGGER.trace("Trace log message");
        return hotelService.all();
    }

    @ApiOperation(value = "Find a hotel by ID", response = Hotel.class)
    @GetMapping("/{id}")
    @Override
    public Hotel one(@PathVariable Long id) {
        return hotelService.one(id);
    }

    @ApiOperation(value = "Add a new hotel", response = Long.class)
    @PostMapping
    @Override
    public Long createOne(@RequestBody Hotel hotel) {
        return hotelService.createOne(hotel);
    }

    @ApiOperation(value = "Update a existing hotel")
    @PutMapping("/{id}")
    @Override
    public void updateOne(@PathVariable Long id, @RequestBody Hotel hotel) {
        hotelService.updateOne(id, hotel);
    }

    @ApiOperation(value = "Delete a hotel")
    @DeleteMapping("/{id}")
    @Override
    public void deleteOne(@PathVariable Long id) {
        hotelService.deleteOne(id);
    }

    @ApiOperation(value = "Deactivate a hotel")
    @PatchMapping("/{id}")
    @Override
    public void deactivateOne(@PathVariable Long id) {
        hotelService.deactivateOne(id);
    }

    @ApiOperation(value = "Get an exception")
    @GetMapping("/exception")
    public void exception() {
        throw new CustomNotFoundException("Not found custom with name is ...");
    }

    @ApiOperation(value = "Get a value from application.properties")
    @GetMapping("/env")
    public String env() {
        return env.getProperty("user.firstname") + " " + lastname;
    }
}
