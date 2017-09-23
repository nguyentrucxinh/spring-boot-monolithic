package com.xinhnguyen.web.controller;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.service.HotelService;
import com.xinhnguyen.web.interfaces.ControllerInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController implements ControllerInterface<Hotel> {

    private HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    @Override
    public List<Hotel> all() {
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
