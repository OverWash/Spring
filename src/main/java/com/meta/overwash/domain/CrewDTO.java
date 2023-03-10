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

	private Long crewId;
	private UserDTO user;
	private Date crewBirth;
	private String crewContact;
	private String CrewName;
	private String carType;
	private String carNumber;
}
