package com.example.hotelReservation.adapter.controller;


import com.example.hotelReservation.adapter.dto.HotelRequestDTO;
import com.example.hotelReservation.adapter.dto.HotelResponseDTO;
import com.example.hotelReservation.adapter.mapper.controller.HotelControllerMapper;
import com.example.hotelReservation.application.usecase.CreateHotelUseCase;
import com.example.hotelReservation.entities.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hotels")
public class HotelController {

    private final CreateHotelUseCase createHotelUseCase;

    @PostMapping
    public HotelResponseDTO createHotel(@RequestBody HotelRequestDTO request) {
        Hotel hotel = createHotelUseCase.execute(HotelControllerMapper.map.hotelRequestDtoToHotel(request));
        return HotelControllerMapper.map.hotelToHotelResponseDto(hotel);
    }
}
