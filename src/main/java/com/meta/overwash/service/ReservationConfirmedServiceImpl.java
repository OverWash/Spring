package com.meta.overwash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.LaundryFactoryDTO;
import com.meta.overwash.domain.ReservationConfirmedDTO;
import com.meta.overwash.mapper.LaundryFactoryMapper;
import com.meta.overwash.mapper.ReservationConfirmedMapper;
import com.meta.overwash.mapper.ReservationMapper;

@Service
public class ReservationConfirmedServiceImpl implements ReservationConfirmedService {

	@Autowired
	ReservationConfirmedMapper rcMapper;

	@Autowired
	LaundryFactoryMapper factoryMapper;

	@Autowired
	ReservationMapper resMapper;

	@Override
	public List<ReservationConfirmedDTO> getList(Criteria cri) {

		return rcMapper.getList(cri);
	}

	@Override
	public Long getCount() {
		return rcMapper.getCount();
	}

	@Override
	@Transactional
	public ReservationConfirmedDTO insertReservationConfirmed(ReservationConfirmedDTO rcDto) {
		String factoryAddress = rcDto.getReservation().getMember().getMemberAddress().split(" ")[0];
		LaundryFactoryDTO factory = factoryMapper.getLaundryFactoryByAddr(factoryAddress);
		if (factory.getFactoryId() == null) {
			return null; // exception으로 넘길 예정
		}
		rcDto.setFactory(factory);
		rcMapper.insertReservationConfirm(rcDto);
		resMapper.updateReservationStatus("예약확정");
		return rcDto;
	}
}
