package com.meta.overwash.service;

import java.util.List;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.ReservationConfirmedDTO;

public interface ReservationConfirmedService {

	public List<ReservationConfirmedDTO> getList(Criteria cri);

	public Long getCount();

	ReservationConfirmedDTO insertReservationConfirmed(ReservationConfirmedDTO rcDto);
}
