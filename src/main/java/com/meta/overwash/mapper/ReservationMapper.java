package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Reservation;

public interface ReservationMapper {
	
	public List<Reservation> getList();

	public void insertReservation(Reservation reservation);
	
	public Reservation getReservation(Long reservationId); 

	public int updateReservation(Reservation reservation);
	
	public int deleteReservation(Long reservationId); 
}
