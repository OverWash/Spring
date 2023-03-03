package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Delivery;

public interface DeliveryMapper {
	
	public List<Delivery> getList();

	public void insertDelivery(Delivery delivery);
	
	public Delivery getDelivery(Long deliveryId);

	public int updateDelivery(Delivery delivery);
	
	public int deleteDelivery(Long deliveryId); 
}
