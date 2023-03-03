package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.DeliveryDTO;

public interface DeliveryMapper {
	
	public List<DeliveryDTO> getList();

	public void insertDelivery(DeliveryDTO delivery);
	
	public DeliveryDTO getDelivery(Long deliveryId);

	public int updateDelivery(DeliveryDTO delivery);
	
	public int deleteDelivery(Long deliveryId); 
}
