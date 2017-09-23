package com.xinhnguyen.web;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.service.HotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    private HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/hotels")
    public List<Hotel> getHotels() {
        return this.hotelService.all();
    }
}
