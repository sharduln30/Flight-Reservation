package com.shardul.flightreservation.services;

import com.shardul.flightreservation.dto.ReservationRequest;
import com.shardul.flightreservation.entities.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);
	
}
