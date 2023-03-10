package com.meta.overwash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meta.overwash.domain.CheckDTO;
import com.meta.overwash.domain.Criteria;
import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.domain.PaymentRequestDTO;
import com.meta.overwash.domain.ReceiptDTO;
import com.meta.overwash.domain.ReservationConfirmedDTO;
import com.meta.overwash.mapper.CheckMapper;
import com.meta.overwash.mapper.PaymentRequestMapper;
import com.meta.overwash.mapper.ReservationConfirmedMapper;
import com.meta.overwash.mapper.ReservationMapper;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	ReservationConfirmedMapper rcMapper;

	@Autowired
	CheckMapper checkMapper;

	@Autowired
	PaymentRequestMapper prMapper;

	@Autowired
	ReservationMapper reservationMapper;

	// 관리자
	/*-	
	 * 관리자가 검품 시 CheckDTO의 list를 받고 confirmId를 받는다.
	 * => 서비스에서는 Check물품과 Confirm Id를 통해 Check에 한 번에 insert 
	 * => 총 금액은 미리 가져놓아둠 
	 * => 결제요청서 생성 (의류에 대한 정보를 갖고 있을 수 있음) (insert)
	 * 
	 */
	@Override
	@Transactional
	public PaymentRequestDTO requestToAdmin(Integer confirmId, List<LaundryDTO> laundryList) {
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
		reservationMapper.updateReservation(rcDto.getReservation());
		return prDto;
	}

	// 고객
	/*-
	 * 결제 진행 시 어떤 건에 대해 결제를 진행할 지 
	 * 정보가 있어야 하기 때문에 파라미터로 결제요청 번호를 받음
	 * 또, 결제 방식에 대한 정보를 받아야 해서 
	 * 
	 * */
	@Override
	public boolean paymentProcess(ReceiptDTO receipt) {

		return false;
	}

	// RestController Paging 관리자 내역
	@Override
	public List<PaymentRequestDTO> getListToAdmin(Criteria cri) {

		return prMapper.getListToAdmin(cri);
	}

	@Override
	public List<PaymentRequestDTO> getListToMember(Criteria cri, Long memberId) {

		return prMapper.getListToAdmin(cri);
	}

	@Override
	public Long getCountToMember(Long memberId) {

		return prMapper.getCountToMember(memberId);
	}

	@Override
	public PaymentRequestDTO get(Long pno) {
		return prMapper.getPaymentRequest(pno);
	}

	@Override
	public Long getCountToAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}
