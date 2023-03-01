package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Member;

public interface MemberMapper {

	public List<Member> getMember();
	public Integer getMemberNum(); 
}
