package com.xinhnguyen.web.api;

import com.xinhnguyen.domain.Hotel;
import com.xinhnguyen.service.HotelService;
import com.xinhnguyen.web.exception.CustomNotFoundException;
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

@RestController
@RequestMapping("/api/hotels")
public class HotelController implements BaseController<Hotel, Long> {

    private static Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
//    private static Logger LOGGER = LoggerFactory.getLogger(HotelController.class);

    @Autowired
    private HotelService hotelService;

    @Autowired
    private Environment env;

    @Value("${user.lastname}")
    private String lastname;

    @ApiOperation(value = "${HotelController.findAllPaging.title}", notes = "${HotelController.findAllPaging.notes}")
    @GetMapping("/paging")
    @Override
    public Page<Hotel> findAll(@PageableDefault(size = 2, page = 1, sort = "name") Pageable pageable) {
        return hotelService.findAll(pageable);
    }

    @ApiOperation(value = "${HotelController.findAll.title}", notes = "${HotelController.findAll.notes}")
    @GetMapping
    @Override
    public List<Hotel> findAll() {
        LOGGER.debug("Debug log message");
        LOGGER.info("Info log message");
        LOGGER.error("Error log message");
        LOGGER.warn("Warn log message");
        LOGGER.trace("Trace log message");
        return hotelService.findAll();
    }

    @ApiOperation(value = "${HotelController.findById.title}", notes = "${HotelController.findById.notes}")
    @GetMapping("/{id}")
    @Override
    public Hotel findById(@PathVariable Long id) {
        return hotelService.findById(id);
    }

    @ApiOperation(value = "${HotelController.create.title}", notes = "${HotelController.create.notes}")
    @PostMapping
    @Override
    public Long create(@RequestBody Hotel hotel) {
        return hotelService.create(hotel);
    }

    @ApiOperation(value = "${HotelController.update.title}", notes = "${HotelController.update.notes}")
    @PutMapping("/{id}")
    @Override
    public void update(@PathVariable Long id, @RequestBody Hotel hotel) {
        hotelService.update(id, hotel);
    }

    @ApiOperation(value = "${HotelController.delete.title}", notes = "${HotelController.delete.notes}")
    @DeleteMapping("/{id}")
    @Override
    public void deleteById(@PathVariable Long id) {
        hotelService.deleteById(id);
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
