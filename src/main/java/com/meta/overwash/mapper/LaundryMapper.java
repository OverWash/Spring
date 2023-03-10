package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.domain.ReservationConfirmedDTO;

public interface LaundryMapper {
	
	public List<LaundryDTO> getList();
	public ReservationConfirmedDTO updateWashComplete();

}
