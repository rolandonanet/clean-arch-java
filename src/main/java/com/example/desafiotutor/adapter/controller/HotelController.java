gapackage com.example.desafiotutor.adapter.controller;

import com.example.desafiotutor.adapter.dto.HotelRequestDTO;
import com.example.desafiotutor.application.usecase.CreateHotelUseCase;
import com.example.desafiotutor.domain.model.Hotel;
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
