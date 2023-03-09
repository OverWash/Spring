package com.meta.overwash.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class CheckDTO {
	private Integer checkId;
	private ReservationConfirmedDTO confirm;
	private LaundryDTO laundry;
}
