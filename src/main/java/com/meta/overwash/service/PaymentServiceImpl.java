package com.meta.overwash.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meta.overwash.domain.CheckDTO;
import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.domain.PagenationDTO;
import com.meta.overwash.domain.PaymentRequestDTO;
import com.meta.overwash.domain.ReceiptDTO;
import com.meta.overwash.domain.ReservationConfirmedDTO;
import com.meta.overwash.domain.UserDTO;
import com.meta.overwash.mapper.CheckMapper;
import com.meta.overwash.mapper.PaymentRequestMapper;
import com.meta.overwash.mapper.ReceiptMapper;
import com.meta.overwash.mapper.ReservationConfirmedMapper;
import com.meta.overwash.mapper.ReservationMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	ReservationConfirmedMapper rcMapper;

	@Autowired
	CheckMapper checkMapper;

	@Autowired
	PaymentRequestMapper prMapper;

	@Autowired
	ReservationMapper reservationMapper;

	@Autowired
	ReceiptMapper receiptMapper;

	// 결제 요청서 생성
	@Override
	@Transactional
	public PaymentRequestDTO requestToAdmin(Long confirmId, List<LaundryDTO> laundryList) {
		ReservationConfirmedDTO rcDto = rcMapper.getReservationConfirm(confirmId);
		int price = 0;
		for (LaundryDTO laundry : laundryList) {
			CheckDTO check = new CheckDTO(null, rcDto, laundry);
			checkMapper.insertCheck(check);
			price += laundry.getLaundryPrice().getPrice();
		}

		PaymentRequestDTO prDto = new PaymentRequestDTO();
		prDto.setPrPrice(price);
		prDto.setConfirm(rcDto);
		prMapper.insertPaymentRequest(prDto);
		rcDto.getReservation().setReservationStatus("검수완료");
		reservationMapper.updateReservationStatus(rcDto.getReservation());
		return prDto;
	}

	// RestController Paging 관리자 내역
	@Override
	public Map<String, Object> getListToAdmin(Criteria cri) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("paymentPaging", new PagenationDTO(cri, getCountToAdmin(cri).intValue()));
		map.put("paymentRequests", prMapper.getListToAdmin(cri));
		return map;
	}

//	// Rest Controller Paging 고객 내역
//	@Override
//	public Map<String, Object> getListToMember(Criteria cri, Long userId) {
//		// Mapper에 들어갈 파라미터 map으로 변환
//		HashMap<String, Object> vo = new HashMap<String, Object>();
//		vo.put("pageNum", cri.getPageNum());
//		vo.put("amount", cri.getAmount());
//		vo.put("userId", userId);
//
//		// 페이징 처리를 위해 map으로 데이터 리턴
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("paymentPaging", new PagenationDTO(cri, getCountToMember(userId, cri).intValue()));
//		map.put("paymentRequests", prMapper.getListToMember(vo));
//		return map;
//	}
	
	@Override
	public List<PaymentRequestDTO> getPrListToMember(Long userId) {
		return prMapper.getPrListToMemberNotPaging(userId);
	}

	@Override
	public PaymentRequestDTO get(Long pno) {
		return prMapper.getPaymentRequest(pno);
	}

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

//		receiptMapper.insertReceipt();
		// 영수증 발급 후 예약의 예약상태 '결제완료'로 변경
		// 그러기 위해서는 예약번호를 들고와야.. 어디서?
		// 결제를 진행할때는 결제요청서를 가지고 있음. 결제요청서에는 예약확정번호가 있고 거기엔 예약번호가 있다.

		// reservationMapper.updateReservationStatus(null);
	}

	@Override
	public ReceiptDTO getReceipt(Long receiptId) {
		return receiptMapper.getReceipt(receiptId);
	}

	@Override
	public List<ReceiptDTO> getReceiptList(Long userId) {
		return receiptMapper.getReceiptList(userId);
	}

	/* ------------서비스 내부에서 쓸 메소드 -------------- */

	private Long getCountToMember(Long userId, Criteria cri) {
		UserDTO user = new UserDTO();
		user.setUserId(userId);
		return prMapper.getCountToMember(user);
	}

	private Long getCountToAdmin(Criteria cri) {

		return prMapper.getCountToAdmin(cri);
	}

}
