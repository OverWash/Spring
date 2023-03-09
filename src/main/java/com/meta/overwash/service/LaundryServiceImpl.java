package com.meta.overwash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.overwash.domain.LaundryDTO;
import com.meta.overwash.mapper.LaundryMapper;

@Service
public class LaundryServiceImpl implements LaundryService {

	@Autowired
	LaundryMapper laundryMapper;

	@Override
	public List<LaundryDTO> getList() {

		return laundryMapper.getList();
	}

	@Override
	public int getCount() {
		return laundryMapper.getLaundryCnt();
	}

}
