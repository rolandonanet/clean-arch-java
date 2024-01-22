//package com.example.hotelReservation.adapter.controller;
//
//import com.example.hotelReservation.entities.Room;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RequiredArgsConstructor
//@RestController
//@RequestMapping("/hotels/{hotelId}/rooms")
//public class RoomController {
//
//    private final RoomUseCase roomUseCase;
//
//    @PostMapping
//    public void createRoom(@PathVariable Long hotelId, @RequestBody Room room) {
//        roomUseCase.createRoom(hotelId, room);
//    }
//
//}
