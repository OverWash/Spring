package com.meta.overwash.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {

	private Long reservationId;
	@DateTimeFormat(pattern = "yyyy-MM-dd" )
	private Date collectDate;
	private Date reservationDate;
	private String request;
	private String laundryType;
	private String reservationStatus;
	private MemberDTO member;
}
