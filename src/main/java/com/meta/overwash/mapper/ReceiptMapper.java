package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.ReceiptDTO;

public interface ReceiptMapper {

	public void insertReceipt(ReceiptDTO receipt);

	// 영수증번호로 상세보기 가져옴
	public ReceiptDTO getReceipt(Long receiptId);

	public List<ReceiptDTO> getReceiptList(Long userId);

}
