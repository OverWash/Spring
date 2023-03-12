package com.meta.overwash.service;

import java.util.List;
import java.util.Map;

import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.domain.PaymentRequestDTO;

public interface PaymentService {

	// 관리자 결제요청 서비스
	public PaymentRequestDTO requestToAdmin(Long confirmId, List<LaundryDTO> laundryList);

	// 관리자 리스트 내역 조회
	public Map<String, Object> getListToAdmin(Criteria cri);

	/*----------------------------------------------------------------------------------*/

	// 고객 결제요청 수
	public Map<String, Object> getListToMember(Criteria cri, Long userId);

	// 상세 내역 조회
	public PaymentRequestDTO get(Long pno);

}
