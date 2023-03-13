package com.meta.overwash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meta.overwash.domain.ReservationDTO;
import com.meta.overwash.domain.WashingCompleteDTO;
import com.meta.overwash.mapper.ReservationMapper;

import lombok.extern.log4j.Log4j;


@Service
@Log4j
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	ReservationMapper mapper;
	
	@Override
	public List<ReservationDTO> getList() {
		return mapper.getList();
	}
	
	@Override
	public List<ReservationDTO> getListEach(Long memberId) {
		return mapper.getListEach(memberId);
	}
	
	@Override
	public ReservationDTO getListEachOne(ReservationDTO reservation) {
		return mapper.getListEachOne(reservation);
	}
	
	@Override
	public void register(ReservationDTO reservation) {
		mapper.insertReservation(reservation);
	}

	@Override
	public void updateReservationStatus(ReservationDTO reservation) {
		mapper.updateReservationStatus(reservation);
	}
	
	@Override
	@Transactional
	public void registerWashingComplete(WashingCompleteDTO washComplete) {
		mapper.insertWashingComplete(washComplete);
		ReservationDTO reservation = washComplete.getConfirm().getReservation();
		reservation.setReservationStatus("세탁완료");
		updateReservationStatus(reservation);
	}

	@Override
	public List<ReservationDTO> getListMember(Long memberId) {
		return mapper.getListMember(memberId);
	}

	@Override
	public Long getMemberId(String username) {
		return mapper.getMemberId(username);
	}




}
