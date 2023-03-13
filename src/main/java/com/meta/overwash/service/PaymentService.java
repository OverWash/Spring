package com.meta.overwash.service;

import java.util.List;
import java.util.Map;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.domain.PaymentRequestDTO;
import com.meta.overwash.domain.ReceiptDTO;
public interface PaymentService {

	// 관리자 결제요청 서비스
	public PaymentRequestDTO requestToAdmin(Long confirmId, List<LaundryDTO> laundryList);

	// 관리자 리스트 내역 조회
	public Map<String, Object> getListToAdmin(Criteria cri);

	/*----------------------------------------------------------------------------------*/

	// 고객 결제요청 리스트 
	public Map<String, Object> getListToMember(Criteria cri, Long userId);
	
	// 상세 내역 조회
	public PaymentRequestDTO get(Long pno);

	// 고객 영수증 발급 (결제 수행)
	// 결제 후 예약테이블의 예약상태를 '결제완료'로 변경	
	public void paymentProcess(ReceiptDTO receipt);

	public ReceiptDTO getReceipt(Long receiptId);

	public List<ReceiptDTO> getReceiptList(Long userId);

	List<PaymentRequestDTO> getListToMember(Long userId);
	 
}