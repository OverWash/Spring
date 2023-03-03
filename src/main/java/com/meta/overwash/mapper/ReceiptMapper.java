package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Receipt;

public interface ReceiptMapper {
	
	public List<Receipt> getList();

	public void insertReceipt(Receipt receipt);
	
	public Receipt getReceipt(Long receiptId); 

	public int updateReceipt(Receipt receipt);
	
	public int deleteReceipt(Long receiptId); 
}
