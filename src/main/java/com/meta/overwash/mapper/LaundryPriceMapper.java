package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.LaundryPrice;

public interface LaundryPriceMapper {
	
	public List<LaundryPrice> getList();

	public void insertLaundryPrice(LaundryPrice price);
	
	public LaundryPrice getLaundryPrice(Long priceId); 

	public int updateLaundryPrice(LaundryPrice price);
	
	public int deleteLaundryPrice(Long priceId); 
}
