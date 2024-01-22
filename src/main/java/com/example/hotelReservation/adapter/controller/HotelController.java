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

    @ApiOperation(value = "Create a new hotel", response = HotelResponseDTO.class)
    @PostMapping
    public HotelResponseDTO createHotel(@RequestBody HotelRequestDTO request) {
        Hotel hotel = createHotelUseCase.execute(HotelControllerMapper.map.hotelRequestDtoToHotel(request));
        return HotelControllerMapper.map.hotelToHotelResponseDto(hotel);
    }

    @PostMapping("/{hotelId}/room")
    public RoomResponseDTO createRoom(@RequestBody RoomRequestDTO request, @PathVariable String hotelId){
        Room room = createRoomUseCase.execute(hotelId,RoomControllerMapper.map.roomRequestDtoToRoom(request));
        return RoomControllerMapper.map.roomToRoomResponseDto(room);
    }


    @PutMapping("/{hotelId}")
    public HotelResponseDTO updateHotel(@RequestBody HotelRequestDTO request, @PathVariable String hotelId){
        Hotel hotel = updateHotelUseCase.execute(hotelId, HotelControllerMapper.map.hotelRequestDtoToHotel(request));
        return HotelControllerMapper.map.hotelToHotelResponseDto(hotel);
    }

    @PutMapping("/{hotelId}/room/{roomId}")
    public RoomResponseDTO updateHotelRoom(@RequestBody RoomRequestDTO request, @PathVariable String hotelId, @PathVariable String roomId){
        Room room = updateRoomUseCase.execute(hotelId, roomId, RoomControllerMapper.map.roomRequestDtoToRoom(request));
        return RoomControllerMapper.map.roomToRoomResponseDto(room);
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
