package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.ReservationConfirmedDTO;

public interface ReservationConfirmedMapper {

	public List<ReservationConfirmedDTO> getList(Criteria cri);

	public void insertReservationConfirm(ReservationConfirmedDTO rc);

	public ReservationConfirmedDTO getReservationConfirm(Integer confirmId);

	public Long updateReservationConfirm(ReservationConfirmedDTO rc);

	public Long deleteReservationConfirm(Long confirmId);

	public Long getCount();
}
