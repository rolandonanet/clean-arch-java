package com.example.hotelReservation.adapter.controller;


import com.example.hotelReservation.adapter.dto.HotelRequestDTO;
import com.example.hotelReservation.adapter.dto.HotelResponseDTO;
import com.example.hotelReservation.adapter.dto.RoomRequestDTO;
import com.example.hotelReservation.adapter.dto.RoomResponseDTO;
import com.example.hotelReservation.adapter.mapper.controller.HotelControllerMapper;
import com.example.hotelReservation.application.usecase.CreateHotelUseCase;
import com.example.hotelReservation.application.usecase.ListHotelsUseCase;
import com.example.hotelReservation.entities.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/hotel", consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class HotelController {

    private final CreateHotelUseCase createHotelUseCase;
    private final ListHotelsUseCase listHotelsUseCase;

    @PostMapping
    public HotelResponseDTO createHotel(@RequestBody HotelRequestDTO request) {
        Hotel hotel = createHotelUseCase.execute(HotelControllerMapper.map.hotelRequestDtoToHotel(request));
        return HotelControllerMapper.map.hotelToHotelResponseDto(hotel);
    }

    @PostMapping("/{hotelId}/room")
    public RoomResponseDTO createRoom(@RequestBody RoomRequestDTO request, @PathVariable String hotelId){
        return null;
    }


    @PutMapping("/{hotelId}")
    public HotelResponseDTO updateHotel(@RequestBody HotelRequestDTO request, @PathVariable String hotelId){
        return null;
    }

    @PutMapping("/{hotelId}/room/{roomId}")
    public RoomResponseDTO updateHotelRoom(@RequestBody RoomRequestDTO request, @PathVariable String hotelId, @PathVariable String roomId){
        return null;
    }

    @GetMapping("/list")
    public List<HotelResponseDTO> listHotels(){
        List<Hotel> hotels = listHotelsUseCase.execute();
        return HotelControllerMapper.map.listHotelToListHotelResponseDto(hotels);
    }

    @GetMapping("/{hotelId}/list")
    public List<RoomResponseDTO> listHotelRooms(@PathVariable String hotelId){
        return null;
    }
}
