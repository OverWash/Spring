package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Delivery;

public interface DeliveryMapper {
	public List<Delivery> getList();

	public Integer get();

	public void deliveryInsert(Delivery delivery);

	public int deliveryUpdate(Delivery delivery);
	
	public int deliveryDelete(Long deliveryId); 
}
