package com.meta.overwash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.domain.ReservationDTO;
import com.meta.overwash.domain.UserDTO;
import com.meta.overwash.domain.WashingCompleteDTO;
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
	@Transactional
	public boolean modify(UserDTO user, CrewDTO crew) throws Exception {
		
		if (user.getPassword() != null) {
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			if(userMapper.updateUser(user) == 0) return false; 
		}
		
		return crewMapper.updateCrew(crew) == 1;
	}

	@Override
	public CrewDTO getCrew(Long userId) throws Exception {
		return crewMapper.getCrew(userId);
	}
	
	public List<CrewDTO> getCrewList(String role) throws Exception {
		return crewMapper.getCrewList(role);
	}

	@Override
	public boolean checkPw(UserDTO user) throws Exception {
		UserDTO userInfo = userMapper.getUser(user.getEmail());
		
		if (userInfo != null) {
			if (bCryptPasswordEncoder.matches(user.getPassword(), userInfo.getPassword())) {
				return true;
			}
		}
		return false;
		
	}
	public String getContact(String contact) throws Exception {
		return crewMapper.getCrewContact(contact);
	}

	@Override
	public List<ReservationDTO> getToBeCollectList() throws Exception {
		return crewMapper.selectToBeCollectList();
	}

	@Override
	public List<WashingCompleteDTO> getDeliveryList(String status) throws Exception {
		
		List<WashingCompleteDTO> deliveryList = new ArrayList<WashingCompleteDTO>();
		
		for (WashingCompleteDTO washingCompleteDTO : crewMapper.selectDelivery()) {
			if (washingCompleteDTO.getConfirm().getReservation().getReservationStatus().equals(status)) {
				deliveryList.add(washingCompleteDTO);
			}
		}
		
		return deliveryList;
	}

	@Override
	public boolean updateStatus(Long reservationId) throws Exception {
		return crewMapper.updateStatus(reservationId) == 1;
	}
	
}




















