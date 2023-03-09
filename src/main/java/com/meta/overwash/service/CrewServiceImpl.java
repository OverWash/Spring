package com.meta.overwash.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.UserDTO;
import com.meta.overwash.mapper.CrewMapper;
import com.meta.overwash.mapper.UserMapper;

@Service
public class CrewServiceImpl implements CrewService {

	@Autowired
	private CrewMapper crewMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	@Transactional
	public void insert(UserDTO user, CrewDTO crew) throws Exception {
		
		user.setRole("ROLE_CREW");
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userMapper.insertUser(user);
		
		crew.setUser(user);
		
		crewMapper.insertCrew(crew);
	}

	@Override
	public boolean remove(Long crewId) throws Exception {
		return crewMapper.deleteCrew(crewId) == 1;
	}

	@Override
	public boolean modify(CrewDTO crew) throws Exception {
//		crewDTO.setPassword(bCryptPasswordEncoder.encode(crewDTO.getPassword()));
		return crewMapper.updateCrew(crew) == 1;
	}

	@Override
	public Map<String, Object> get(Long crewId) throws Exception {
		return crewMapper.getCrew(crewId);
	}
	
}




















