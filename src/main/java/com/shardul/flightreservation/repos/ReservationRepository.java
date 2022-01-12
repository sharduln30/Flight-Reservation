package com.shardul.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shardul.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
