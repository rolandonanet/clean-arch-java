gapackage com.example.desafiotutor.adapter.controller;

import com.example.hotelReservation.adapter.dto.HotelRequestDTO;
import com.example.hotelReservation.application.usecase.CreateHotelUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hotels")
public class HotelController {

    private final CreateHotelUseCase createHotelUseCase;

    @PostMapping
    public void createHotel(@RequestBody HotelRequestDTO request) {
        createHotelUseCase.execute(request.toDTO());
    }
//
//    @PutMapping("/{hotelId}")
//    public void updateHotel(@PathVariable Long hotelId, @RequestBody Hotel hotel) {
//        hotelUseCase.updateHotel(hotelId, hotel);
//    }

}
