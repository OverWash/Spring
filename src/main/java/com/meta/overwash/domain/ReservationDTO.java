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

	Integer reservationId;
	Date collectDate;
	Date reservationDate;
	String request;
	String laundryType;
	String reservationStatus;
	MemberDTO member;
}
