package com.shardul.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shardul.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
