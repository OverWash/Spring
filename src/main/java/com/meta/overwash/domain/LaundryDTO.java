package com.meta.overwash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LaundryDTO {
	Integer laundryId;
	String name;
	String type;
	LaundryPriceDTO laundryPrice;

}
