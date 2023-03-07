package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.MemberDTO;

public interface MemberMapper {

	public List<MemberDTO> getList();

	public void insertMember(MemberDTO member);
	
	public void insertSelectKeyMember(MemberDTO member);

	public MemberDTO getMember(Long memberId);
	
	public int updateMember(MemberDTO member);

	public int deleteMember(Long memberId);
}
