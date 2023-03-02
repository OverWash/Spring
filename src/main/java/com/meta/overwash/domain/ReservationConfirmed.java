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
public class ReservationConfirmed {
	Integer confirmId;
	Date confirmDate;
	LaundryFactory factory;
	Crew crew;
	Reservation reservation;
}
