package com.meta.overwash.service;

import java.util.List;

import com.meta.overwash.domain.CheckDTO;
import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.domain.PaymentRequestDTO;
import com.meta.overwash.domain.ReceiptDTO;

public interface PaymentService {

	public PaymentRequestDTO request(Integer confirmId, List<LaundryDTO> laundryList);

	public boolean process(ReceiptDTO receiptDto, PaymentRequestDTO paymentDto);
}
