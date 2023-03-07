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
public class CrewDTO {

	private Integer crewId;
	private String email;
	private String password;
	private Date crewBirth;
	private String carType;
	private String carNumber;
}
