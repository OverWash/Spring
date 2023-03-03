package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Member;

public interface MemberMapper {

	/*
	public List<Member> getMember();
	public Integer getMemberNum(); */

	//---------------------
	public List<Member> getList();

	public Integer get();

	public void memberInsert(Member member);

	public int memberUpdate(Member member);
	
	public int memberDelete(Long memberId);
}
