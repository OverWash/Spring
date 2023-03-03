package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Member;

public interface MemberMapper {

	public List<Member> getList();

	public void insertMember(Member member);

	public Member getMember(Long memberId);

	public int updateMember(Member member);

	public int deleteMember(Long memberId);
}
