package com.meta.overwash.domain;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

	Integer memberId;
	String email;
	String password;
	String memberAddress;
//	String memberContact;
//	Integer advancePayment;
//	Character membership;
	Integer point;
	Date signDate;
	String nickname;
}
