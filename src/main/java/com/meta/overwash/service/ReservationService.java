package com.meta.overwash.service;

import java.util.List;

import com.meta.overwash.domain.ReservationDTO;
import com.meta.overwash.domain.WashingCompleteDTO;

public interface ReservationService {
	public List<ReservationDTO> getList();
	public List<ReservationDTO> getListEach(Long memberId);
	public List<ReservationDTO> getListEachOne(ReservationDTO reservation);
	public List<ReservationDTO> getListMember(String username);
	public void register(ReservationDTO reservation);
	public void updateReservationStatus(ReservationDTO reservation);
	public void registerWashingComplete(WashingCompleteDTO washComplete);
	
	
}
