package com.meta.overwash.service;

import java.util.Map;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.ReservationConfirmedDTO;

public interface ReservationConfirmedService {

	public Map<String, Object> getList(Criteria cri);

	public ReservationConfirmedDTO insertReservationConfirmed(ReservationConfirmedDTO rcDto);
}
