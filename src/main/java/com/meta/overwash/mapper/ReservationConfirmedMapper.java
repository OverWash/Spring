package com.meta.overwash.mapper;

import java.util.HashMap;
import java.util.List;

import com.meta.overwash.domain.ReservationConfirmedDTO;
import com.meta.overwash.domain.UserDTO;

public interface ReservationConfirmedMapper {

	public List<ReservationConfirmedDTO> getList(HashMap<String,Object> hash); 

	public void insertReservationConfirm(ReservationConfirmedDTO rc);

	public ReservationConfirmedDTO getReservationConfirm(Long confirmId);

//	public Long updateReservationConfirm(ReservationConfirmedDTO rc);
//
//	public Long deleteReservationConfirm(Long confirmId);

	public Long getCount(UserDTO users);
	
	//관리자 세탁예정목록 가져오기(결제가 완료된)
	public List<ReservationConfirmedDTO> getListByPaymentComplete();
	
	
	
}
