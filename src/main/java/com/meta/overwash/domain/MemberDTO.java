package com.meta.overwash.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberDTO {

	private Integer memberId;
	private String email;
	private String password;
	private String memberAddress;
	private String memberContact;
//	Integer advancePayment;
//	Character membership;
//	Integer point;
	private Date signDate;
	private String nickname;
}
