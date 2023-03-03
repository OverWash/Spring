package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Laundry;

public interface LaundryMapper {
	
	public List<Laundry> getList();

	public void insertLaundry(Laundry laundry);

	public int getLaundry(Long laundryId); 

	public int updateLaundry(Laundry laundry);
	
	public int deleteLaundry(Long laundryId); 
}
