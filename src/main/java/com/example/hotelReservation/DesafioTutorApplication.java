package com.example.hotelReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaRepositories("com.example.hotelReservation.infrastructure.persistence.jpa.*")
//@EntityScan("com.example.hotelReservation.infrastructure.persistence.entity.*")
//@SpringBootApplication(scanBasePackages = {"com.example.hotelReservation.infrastructure.persistence.jpa.*","com.example.hotelReservation.adapter.*", "com.example.hotelReservation.infrastructure.*", "com.example.hotelReservation.application.*"})
@SpringBootApplication()
public class DesafioTutorApplication {


    public static void main(String[] args) {
        SpringApplication.run(DesafioTutorApplication.class, args);
    }

}
