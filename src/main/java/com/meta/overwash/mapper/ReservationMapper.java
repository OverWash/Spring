package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.ReservationDTO;
import com.meta.overwash.domain.WashingCompleteDTO;

public interface ReservationMapper {

	public List<ReservationDTO> getList();

	public List<ReservationDTO> getListEach(Long memberId);

	public List<ReservationDTO> getListEachOne(ReservationDTO reservation);

	public void insertReservation(ReservationDTO reservation);

//	public ReservationDTO getReservation(Long reservationId);

	public void insertWashingComplete(WashingCompleteDTO washingComplete);

	public int updateReservationStatus(ReservationDTO reservation);

}
