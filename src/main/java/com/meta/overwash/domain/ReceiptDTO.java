package com.meta.overwash.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReceiptDTO {
	private Integer receiptId;
	private String paymentMethod;
	private Integer apAmount;
	private Integer finalPaymentAmount;
	private PaymentRequestDTO pr;

}
