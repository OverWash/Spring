package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.ReservationDTO;

public interface ReservationMapper {
	
	public List<ReservationDTO> getList();

	public void insertReservation(ReservationDTO reservation);
	
	public ReservationDTO getReservation(Long reservationId); 

	public int updateReservation(ReservationDTO reservation);
	
	public int deleteReservation(Long reservationId); 
}
