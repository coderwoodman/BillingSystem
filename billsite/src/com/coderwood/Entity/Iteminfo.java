package com.coderwood.Entity;

import java.sql.Date;

public class Iteminfo {
	private int itemID;
	private String itemName;
	private int itemsort;
	private int isValid;
	private Date dataCreateTime;
	private Date datachangeLastTime;
	
	public int getItemID() {
        return itemID;
    }
	
	public void setItemID(int itemid) {
		this.itemID=itemid;
    }
	
	public String getItemName() {
        return itemName;
    }
	
	public void setItemName(String itemName) {
		this.itemName=itemName;
    }
	
}
