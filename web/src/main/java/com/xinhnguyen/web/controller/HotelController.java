package com.xinhnguyen.web.controller;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.service.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;
import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController implements BaseController<Hotel, Long> {

    private static Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
//    private static Logger LOGGER = LoggerFactory.getLogger(HotelController.class);

    @Autowired
    private HotelService hotelService;

    @GetMapping("/paging")
    @Override
    public Page<Hotel> all(Pageable pageable) {
        return hotelService.all(pageable);
    }

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

    @GetMapping("/{id}")
    @Override
    public Hotel one(@PathVariable Long id) {
        return hotelService.one(id);
    }

    @PostMapping
    @Override
    public Long createOne(@RequestBody Hotel hotel) {
        return hotelService.createOne(hotel);
    }

    @PutMapping("/{id}")
    @Override
    public void updateOne(@PathVariable Long id, @RequestBody Hotel hotel) {
        hotelService.updateOne(id, hotel);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteOne(@PathVariable Long id) {
        hotelService.deleteOne(id);
    }

    @PatchMapping("/{id}")
    @Override
    public void deactivateOne(@PathVariable Long id) {
        hotelService.deactivateOne(id);
    }

}
