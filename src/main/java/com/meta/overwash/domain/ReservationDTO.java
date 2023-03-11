package com.meta.overwash.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationDTO {

	private Long reservationId;
	private Date collectDate;
	private Date reservationDate;
	private String request;
	private String reservationStatus;
	private MemberDTO member;
}
