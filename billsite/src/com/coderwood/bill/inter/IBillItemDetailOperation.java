package com.coderwood.bill.inter;

import java.util.List;

import com.coderwood.bill.model.BillItemDetail;

public interface IBillItemDetailOperation {
	public BillItemDetail selectBillItemByID(int detailID);
	public List<BillItemDetail> selectBillItems(int itemID);
	public void addBillItem(BillItemDetail billDetailItem);
	public void deleteBillItem(int detailID);
	public void updateBillItem(BillItemDetail billDetailItem);
}

