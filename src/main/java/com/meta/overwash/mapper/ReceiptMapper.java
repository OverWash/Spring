package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.ReceiptDTO;

public interface ReceiptMapper {
	
	public List<ReceiptDTO> getList();

	public void insertReceipt(ReceiptDTO receipt);
	
	public ReceiptDTO getReceipt(Long receiptId); 

	public int updateReceipt(ReceiptDTO receipt);
	
	public int deleteReceipt(Long receiptId); 
}
