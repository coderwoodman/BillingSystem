package com.coderwood.bill.model;

public class BillItemDetail {
	private int detailID;
	private int itemID;
	private String itemDesc;
	
	public int getDetailID() {
        return detailID;
    }
	
	public void setDetailID(int detailID) {
		this.detailID=detailID;
    }
	
	public int getItemID() {
        return itemID;
    }
	
	public void setItemID(int itemid) {
		this.itemID=itemid;
    }
	
	public String getItemDesc() {
        return itemDesc;
    }
	
	public void setItemDesc(String itemDesc) {
		this.itemDesc=itemDesc;
    }
}
