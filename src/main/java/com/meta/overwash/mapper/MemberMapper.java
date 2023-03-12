package com.meta.overwash.mapper;

import java.util.List;
import java.util.Map;

import com.meta.overwash.domain.MemberDTO;

public interface MemberMapper {
	
	public void insertMember(MemberDTO member) throws Exception;
	
	public List<MemberDTO> getMemberList(String role) throws Exception;
	
	public MemberDTO getMember(Long userId) throws Exception;

	public int updateMember(MemberDTO member) throws Exception;
	
	public int deleteMember(Long memberId) throws Exception; 
	
}
