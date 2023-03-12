package com.meta.overwash.service;

import java.util.List;

import com.meta.overwash.domain.ReceiptDTO;

public interface PaymentService {

	// 고객 영수증 발급 (결제 수행)
	// 결제 후 예약테이블의 예약상태를 '결제완료'로 변경	
	public void paymentProcess(ReceiptDTO receipt);

	public ReceiptDTO getReceipt(Long receiptId);

	public List<ReceiptDTO> getReceiptList(Long userId);
	 
}
