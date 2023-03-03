package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.PaymentRequest;

public interface PaymentRequestMapper {
	public List<PaymentRequest> getList();

	public Integer get();

	public void paymentRequestInsert(PaymentRequest paymentRequest);

	public int paymentRequestUpdate(PaymentRequest paymentRequest);
	
	public int paymentRequestDelete(Long prId); 
}
