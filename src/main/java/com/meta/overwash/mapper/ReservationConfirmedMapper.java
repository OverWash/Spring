package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.ReservationConfirmedDTO;

public interface ReservationConfirmedMapper {
	
	public List<ReservationConfirmedDTO> getList();

	public void insertReservationConfirm(ReservationConfirmedDTO rc);
	
	public ReservationConfirmedDTO getReservationConfirm(Long confirmId); 

	public int updateReservationConfirm(ReservationConfirmedDTO rc);
	
	public int deleteReservationConfirm(Long confirmId); 
}
