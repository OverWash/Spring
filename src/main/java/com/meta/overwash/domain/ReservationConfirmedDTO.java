   package com.meta.overwash.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationConfirmedDTO {
	private Long confirmId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date confirmDate;
	private LaundryFactoryDTO factory;
	private CrewDTO crew;
	private ReservationDTO reservation;
}
