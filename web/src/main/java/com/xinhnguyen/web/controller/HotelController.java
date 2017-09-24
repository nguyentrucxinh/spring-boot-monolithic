package com.xinhnguyen.web.controller;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.service.HotelService;
import com.xinhnguyen.web.interfaces.ControllerInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;
import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController implements ControllerInterface<Hotel, Long> {

    private static Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
//    private static Logger LOGGER = LoggerFactory.getLogger(HotelController.class);

    private HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
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
