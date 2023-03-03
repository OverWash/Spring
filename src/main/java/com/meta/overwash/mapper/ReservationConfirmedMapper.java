package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.ReservationConfirmed;

public interface ReservationConfirmedMapper {
	
	public List<ReservationConfirmed> getList();

	public void insertReservationConfirm(ReservationConfirmed rc);
	
	public ReservationConfirmed getReservationConfirm(Long confirmId); 

	public int updateReservationConfirm(ReservationConfirmed rc);
	
	public int deleteReservationConfirm(Long confirmId); 
}
