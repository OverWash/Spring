package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Laundry;

public interface LaundryMapper {
	public List<Laundry> getList();

	public Integer get();

	public void laundryInsert(Laundry laundry);

	public int laundryUpdate(Laundry laundry);
	
	public int laundryDelete(Long laundryId); 
}
