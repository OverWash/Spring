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
public class WashingCompleteDTO {
	private Long wcId;
	private Date wcDate;
	private ReservationConfirmedDTO confirm;

}
