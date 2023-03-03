package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Reservation;

public interface ReservationMapper {
	public List<Reservation> getList();

	public Integer get();

	public void reservationInsert(Reservation reservation);

	public int reservationUpdate(Reservation reservation);
	
	public int reservationDelete(Long reservationId); 

}
