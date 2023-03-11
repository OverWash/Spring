package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.ReceiptDTO;

public interface ReceiptMapper {

	public void insertReceipt(ReceiptDTO receipt);

	// 한 예약건에 대한 영수증이므로 예약번호로 영수증을 가져온다
	public ReceiptDTO getReceipt(Long reservationId);

	public List<ReceiptDTO> getReceiptList();

}
