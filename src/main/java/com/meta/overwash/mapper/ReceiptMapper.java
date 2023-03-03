package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Receipt;

public interface ReceiptMapper {
	public List<Receipt> getList();

	public Integer get();

	public void receiptInsert(Receipt receipt);

	public int receiptUpdate(Receipt receipt);
	
	public int receiptDelete(Long receiptId); 

}
