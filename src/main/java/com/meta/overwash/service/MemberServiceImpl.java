package com.meta.overwash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.mapper.MemberMapper;

import lombok.AllArgsConstructor;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public List<MemberDTO> getList() {
		return mapper.getList();
	}

//	@Override
//	public void insertMember(MemberDTO member) {
////		member.setPassword(bCryptPasswordEncoder.encode(member.getPassword())); // 비밀번호 암호화
//		mapper.insertMember(member);
//	}
//
//	@Override
//	public void insertSelectKeyMember(MemberDTO member) {
//		mapper.insertSelectKeyMember(member);
//	}

	@Override
	public MemberDTO getMember(Long memberId) {
		return mapper.getMember(memberId);
	}

	@Override
	public boolean modifyMember(MemberDTO member) {
		return mapper.updateMember(member) == 1;
	}

//	@Override
//	public boolean removeMember(Long memberId) {
//		return mapper.deleteMember(memberId) == 1;
//	}

//	@Override
//	public boolean loginMember(MemberDTO member) {
//		// 입력한 이메일과 일치하는 이메일에 대한 정보를 가져옴 (pw 포함)
//		MemberDTO inputId = mapper.loginMember(member);
//		System.out.println(inputId);
////		System.out.println(member.getPassword());
//		
//		return true;
//		// 입력한 pw와 db의 pw 비교 (db의 pw를 복호화해서 비교한다)
////		return bCryptPasswordEncoder.matches(member.getPassword(), inputId.getPassword());
//	}
//	
//	// id 중복검사 체크 기능 추가해야 함

}
