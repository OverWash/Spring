package com.meta.overwash.service;

import java.util.List;

import com.meta.overwash.domain.CheckDTO;
import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.domain.PaymentRequestDTO;
import com.meta.overwash.domain.ReceiptDTO;

public interface PaymentService {

	// 관리자 결제요청 서비스
	public PaymentRequestDTO requestToAdmin(Integer confirmId, List<LaundryDTO> laundryList);

	// 관리자 리스트 내역 조회
	public List<PaymentRequestDTO> getListToAdmin(Criteria cri);

	// 관리자 페이징 처리를 위한 CNT
	public Long getCountToAdmin();

	/*----------------------------------------------------------------------------------*/

	// 고객 결제 지불 서비스
	public boolean paymentProcess(ReceiptDTO receiptDto);

	// 고객 결제요청 수
	public List<PaymentRequestDTO> getListToMember(Criteria cri, Long memberId);

	// 상세 내역 조회
	public PaymentRequestDTO get(Long pno);

	// 고객의 페이징 처리 CNT
	public Long getCountToMember(Long memberId);
}
