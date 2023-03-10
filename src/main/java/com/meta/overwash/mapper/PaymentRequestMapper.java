package com.meta.overwash.mapper;

import java.util.HashMap;
import java.util.List;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.PaymentRequestDTO;

public interface PaymentRequestMapper {

	// insert 결제요청
	public void insertPaymentRequest(PaymentRequestDTO pr);

	// paging 결제요청서
	public List<PaymentRequestDTO> getListToAdmin(Criteria cri);

	// paging 결제요청 갯수
	public Long getCountToAdmin();

	// 결제요청 수정
	public Long updatePaymentRequest(PaymentRequestDTO pr);

	// 결제요청 삭제
	public Long deletePaymentRequest(Long prId);

	/*---------------------- Member ----------------------*/

	// 결제요청 상세조회
	public PaymentRequestDTO getPaymentRequest(Long prId);

	// 고객의 결제요청 갯수 페이징처리용
	public Long getCountToMember(Long memberId);

	// 고객의 결제요청 리스트
	public List<PaymentRequestDTO> getListToMember(HashMap<String, Long> hashMap);

}
