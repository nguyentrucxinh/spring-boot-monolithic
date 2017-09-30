package com.xinhnguyen.seeding;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.repository.HotelRepository;
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
        Hotel marriot = new Hotel("Marriot", 5, true);
        Hotel bis = new Hotel("Ibis", 3, false);
        Hotel goldenTulip = new Hotel("Golden Tulip", 4, true);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(marriot);
        hotels.add(bis);
        hotels.add(goldenTulip);

        this.hotelRepository.save(hotels);
    }
}
