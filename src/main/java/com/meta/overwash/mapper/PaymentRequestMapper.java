package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.PaymentRequest;

public interface PaymentRequestMapper {
	
	public List<PaymentRequest> getList();

	public void insertPaymentRequest(PaymentRequest pr);

	public PaymentRequest getPaymentRequest(Long prId);

	public int updatePaymentRequest(PaymentRequest pr);

	public int deletePaymentRequest(Long prId);
}
