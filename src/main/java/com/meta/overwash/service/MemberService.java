package com.meta.overwash.service;

import java.util.List;

import com.meta.overwash.domain.MemberDTO;

public interface MemberService {

	public List<MemberDTO> getList();

//	public void insertMember(MemberDTO member);
//	
//	public void insertSelectKeyMember(MemberDTO member);

	public MemberDTO getMember(Long memberId);
	
	public boolean modifyMember(MemberDTO member);

//	public boolean removeMember(Long memberId);
	
//	public boolean loginMember(MemberDTO member);
}
