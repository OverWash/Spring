package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.LaundryPrice;

public interface LaundryPriceMapper {
	public List<LaundryPrice> getList();

	public Integer get();

	public void laundryPriceInsert(LaundryPrice laundryPrice);

	public int laundryPriceUpdate(LaundryPrice laundryPrice);
	
	public int laundryPriceDelete(Long priceId); 
}
