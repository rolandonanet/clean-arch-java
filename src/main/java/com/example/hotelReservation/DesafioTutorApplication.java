package com.example.hotelReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.hotelReservation.infrastructure.persistence.jpa.*")
@EntityScan("com.example.hotelReservation.infrastructure.persistence.entity.*")
@SpringBootApplication(scanBasePackages = "com.example.hotelReservation.infrastructure.persistence.jpa.*")
public class DesafioTutorApplication {


    public static void main(String[] args) {
        SpringApplication.run(DesafioTutorApplication.class, args);
    }

}
