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
public class ReservationConfirmedDTO {
	private Integer confirmId;
	private Date confirmDate;
	private LaundryFactoryDTO factory;
	private CrewDTO crew;
	private ReservationDTO reservation;
}
