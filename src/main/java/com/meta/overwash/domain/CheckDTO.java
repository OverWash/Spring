package com.meta.overwash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CheckDTO {
	Integer checkId;
	ReservationConfirmedDTO confirm;
	LaundryDTO laundry;
}
