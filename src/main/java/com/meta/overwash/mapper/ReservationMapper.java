package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.ReservationDTO;


public interface ReservationMapper {

	public List<ReservationDTO> getList();

	public List<ReservationDTO> getListEach(Long memberId);
	
	public void insertReservation(ReservationDTO reservation);

	public ReservationDTO getReservation(Long reservationId);

	public int updateReservation(ReservationDTO reservation);

	public int deleteReservation(Long reservationId);

	public Long updateReservationStatus(String string);

}
