package com.example.hotelReservation.adapter.controller;


import com.example.hotelReservation.adapter.dto.HotelRequestDTO;
import com.example.hotelReservation.adapter.dto.HotelResponseDTO;
import com.example.hotelReservation.adapter.dto.RoomRequestDTO;
import com.example.hotelReservation.adapter.dto.RoomResponseDTO;
import com.example.hotelReservation.adapter.mapper.controller.HotelControllerMapper;
import com.example.hotelReservation.adapter.mapper.controller.RoomControllerMapper;
import com.example.hotelReservation.application.usecase.*;
import com.example.hotelReservation.entities.Hotel;
import com.example.hotelReservation.entities.Room;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/hotel", consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class HotelController {

    private final CreateHotelUseCase createHotelUseCase;
    private final CreateRoomUseCase createRoomUseCase;
    private final UpdateHotelUseCase updateHotelUseCase;
    private final UpdateRoomUseCase updateRoomUseCase;
    private final ListHotelsUseCase listHotelsUseCase;
    private final ListHotelRoomsUseCase listHotelRoomsUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createHotel(@RequestBody HotelRequestDTO request) {
        createHotelUseCase.execute(HotelControllerMapper.map.hotelRequestDtoToHotel(request));
    }

    @PostMapping("/{hotelId}/room")
    @ResponseStatus(HttpStatus.CREATED)
    public void createRoom(@RequestBody RoomRequestDTO request, @PathVariable Long hotelId){
        createRoomUseCase.execute(hotelId,RoomControllerMapper.map.roomRequestDtoToRoom(request));
    }


    @PutMapping("/{hotelId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateHotel(@RequestBody HotelRequestDTO request, @PathVariable Long hotelId){
        updateHotelUseCase.execute(hotelId, HotelControllerMapper.map.hotelRequestDtoToHotel(request));
    }

    @PutMapping("/{hotelId}/room/{roomId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateHotelRoom(@RequestBody RoomRequestDTO request, @PathVariable String hotelId, @PathVariable String roomId){
        updateRoomUseCase.execute(hotelId, roomId, RoomControllerMapper.map.roomRequestDtoToRoom(request));
    }

    @GetMapping("/list")
    public List<HotelResponseDTO> listHotels(){
        List<Hotel> hotels = listHotelsUseCase.execute();
        return HotelControllerMapper.map.listHotelToListHotelResponseDto(hotels);
    }

    @GetMapping("/{hotelId}/list")
    public List<RoomResponseDTO> listHotelRooms(@PathVariable String hotelId){
        List<Room> rooms = listHotelRoomsUseCase.execute(hotelId);
        return RoomControllerMapper.map.listRoomToListRoomResponseDto(rooms);
    }
}
