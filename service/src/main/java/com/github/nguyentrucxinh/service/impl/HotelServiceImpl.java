package com.github.nguyentrucxinh.service.impl;

import com.github.nguyentrucxinh.domain.Hotel;
import com.github.nguyentrucxinh.dto.HotelDto;
import com.github.nguyentrucxinh.helper.exception.DTOInServiceNotValidException;
import com.github.nguyentrucxinh.helper.response.ExceptionDetailMessage;
import com.github.nguyentrucxinh.helper.util.ModelMapperUtils;
import com.github.nguyentrucxinh.repository.HotelRepository;
import com.github.nguyentrucxinh.service.HotelService;
import com.github.nguyentrucxinh.service.validation.HotelValidation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private HotelValidation hotelValidation;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Page<HotelDto> findAll(Pageable pageable) {
        Page<Hotel> hotels = hotelRepository.findAll(pageable);
        return modelMapper.map(hotels, ModelMapperUtils.pageType(Hotel.class));
    }

    @Override
    public List<HotelDto> findAll() {
        List<Hotel> hotels = hotelRepository.findAll();
        return modelMapper.map(hotels, ModelMapperUtils.listType(Hotel.class));
    }

    @Override
    public HotelDto findById(Long id) {
        List<ExceptionDetailMessage> exceptionDetailMessages = hotelValidation.isValidateHotelId(id);
        if (!exceptionDetailMessages.isEmpty())
            throw new DTOInServiceNotValidException(exceptionDetailMessages);

        Hotel hotel = hotelRepository.findOne(id);
        return modelMapper.map(hotel, HotelDto.class);
    }

    @Override
    public Long create(HotelDto hotelDto) {
        Hotel hotel = modelMapper.map(hotelDto, Hotel.class);
        return hotelRepository.save(hotel).getId();
    }

    @Override
    public void update(Long id, HotelDto hotelDto) {
        Hotel hotel = hotelRepository.findOne(id);
        hotel.setName(hotelDto.getName());
        hotel.setClassification(hotelDto.getClassification());
        hotel.setOpen(hotel.isOpen());
        hotelRepository.save(hotel);
    }

    @Override
    public void deleteById(Long id) {
        hotelRepository.delete(hotelRepository.findOne(id));
    }
}
