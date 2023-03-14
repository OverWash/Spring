package com.meta.overwash.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@DateTimeFormat(pattern = "yyyy-MM-dd" )
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date deliveryDate;
	private CrewDTO crew;
	private WashingCompleteDTO wc;
}
