package com.coderwood.Entity;

import java.sql.Date;

public class Iteminfo {
	public int ItemID;
	public String ItemName;
	public int Itemsort;
	public int IsValid;
	public Date dataCreateTime;
	public Date datachangeLastTime;
	
	public int getItemID() {
        return ItemID;
    }
	
	public void setItemID(int itemid) {
		ItemID=itemid;
    }
	
	public String getItemName() {
        return ItemName;
    }
	
	public void setItemName(String itemName) {
		ItemName=itemName;
    }
	
}
