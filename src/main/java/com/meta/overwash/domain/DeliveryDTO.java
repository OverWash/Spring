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
public class DeliveryDTO {

	private Integer deliveryId;
	private Date deliveryDate;
	private CrewDTO crew;
	private WashingCompleteDTO wc;
}
