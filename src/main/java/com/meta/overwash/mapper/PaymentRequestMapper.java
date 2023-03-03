package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.PaymentRequestDTO;

public interface PaymentRequestMapper {
	
	public List<PaymentRequestDTO> getList();

	public void insertPaymentRequest(PaymentRequestDTO pr);

	public PaymentRequestDTO getPaymentRequest(Long prId);

	public int updatePaymentRequest(PaymentRequestDTO pr);

	public int deletePaymentRequest(Long prId);
}
