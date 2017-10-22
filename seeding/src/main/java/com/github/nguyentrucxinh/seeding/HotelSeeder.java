package com.github.nguyentrucxinh.seeding;

import com.github.nguyentrucxinh.domain.Hotel;
import com.github.nguyentrucxinh.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HotelSeeder implements CommandLineRunner {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public void run(String... strings) throws Exception {
        Hotel mario = new Hotel();
        mario.setName("Mario");
        mario.setClassification(5);
        mario.setOpen(true);
        Hotel bis = new Hotel();
        bis.setName("Ibis");
        bis.setClassification(3);
        bis.setOpen(false);
        Hotel goldenTulip = new Hotel();
        goldenTulip.setName("Golden Tulip");
        goldenTulip.setClassification(4);
        goldenTulip.setOpen(true);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(mario);
        hotels.add(bis);
        hotels.add(goldenTulip);

        this.hotelRepository.save(hotels);
    }
}
