package com.coderwood.bill.inter;

import java.util.List;

import com.coderwood.bill.model.BillItem;

public interface IBillItemOperation {
	public BillItem selectBillItemByID(int itemID);
	public List<BillItem> selectBillItems(String userName);
	public void addBillItem(BillItem billItem);
	public void deleteBillItem(int itemID);
	public void updateBillItem(BillItem billItem);
	
}