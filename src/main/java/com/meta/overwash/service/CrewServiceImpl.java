package com.meta.overwash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.mapper.CrewMapper;

//@Service
//public class CrewServiceImpl implements CrewService {
//
//	@Autowired
//	private CrewMapper crewMapper;
//	
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//	
//	@Override
//	public void insertCrew(CrewDTO crewDTO) throws Exception {
//		crewDTO.setPassword(bCryptPasswordEncoder.encode(crewDTO.getPassword()));
//		crewMapper.insertCrew(crewDTO);
//	}
//
//	@Override
//	public boolean remove(Long crewId) throws Exception {
//		return crewMapper.deleteCrew(crewId) == 1;
//	}
//
//	@Override
//	public boolean modify(CrewDTO crewDTO) throws Exception {
//		crewDTO.setPassword(bCryptPasswordEncoder.encode(crewDTO.getPassword()));
//		return crewMapper.updateCrew(crewDTO) == 1;
//	}
//
//	@Override
//	public CrewDTO get(Long crewId) throws Exception {
//		return crewMapper.getCrew(crewId);
//	}
//	
//}




















