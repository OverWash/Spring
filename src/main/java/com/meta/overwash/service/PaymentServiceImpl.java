package com.meta.overwash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.overwash.domain.ReceiptDTO;
import com.meta.overwash.mapper.ReceiptMapper;
import com.meta.overwash.mapper.ReservationMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	ReceiptMapper receiptMapper;
	
	@Autowired
	ReservationMapper reservationMapper;

	// 고객
	/*-
	 * 결제 진행 시 어떤 건에 대해 결제를 진행할 지 
	 * 정보가 있어야 하기 때문에 파라미터로 결제요청 번호를 받음
	 * 또, 결제 방식에 대한 정보를 받아야 해서 
	 * 
	 * */
	@Override
	// @Transactional
	public void paymentProcess(ReceiptDTO receipt) {
		log.info("결제 진행......");
		receiptMapper.insertReceipt(receipt);
		// 영수증 발급 후 예약의 예약상태 '결제완료'로 변경
		// 그러기 위해서는 예약번호를 들고와야.. 어디서?
		// 결제를 진행할때는 결제요청서를 가지고 있음. 결제요청서에는 예약확정번호가 잇고 거기엔 예약번호가 잇다.
		
		// reservationMapper.updateReservationStatus(null);
	}
	
	@Override
	public ReceiptDTO getReceipt(Long reservationId) {
		return receiptMapper.getReceipt(reservationId);
	}
	
	@Override
	public List<ReceiptDTO> getReceiptList() {
		return receiptMapper.getReceiptList();
	}

	
	
	

}
