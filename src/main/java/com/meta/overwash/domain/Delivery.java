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
public class Delivery {

	Integer deliveryId;
	Date deliveryDate;
	Crew crew;
	WashingComplete wc;
}
