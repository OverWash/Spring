package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.ReservationConfirmed;

public interface ReservationConfirmedMapper {
	public List<ReservationConfirmed> getList();

	public Integer get();

	public void reservationConfirmInsert(ReservationConfirmed rc);

	public int reservationConfirmUpdate(ReservationConfirmed rc);
	
	public int reservationConfirmDelete(Long confirmId); 

}
