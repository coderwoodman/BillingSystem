package com.coderwood.bill;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.coderwood.bill.inter.IBillItemDetailOperation;
import com.coderwood.bill.inter.IBillItemOperation;
import com.coderwood.bill.model.BillItem;
import com.coderwood.bill.model.BillItemDetail;

public class BillItemContorller {
	 private static SqlSessionFactory sqlSessionFactory;
	    private static Reader reader; 

	    static{
	        try{
	            reader    = Resources.getResourceAsReader("Configuration.xml");
	            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }

	    public static SqlSessionFactory getSession(){
	        return sqlSessionFactory;
	    }
	    
	    public static void main(String[] args) {
//	    	BillItem billItem=GetBillItemByID(12);
//	    	billItem.setItemName("投资2");
//	    	
//	    	//AddBillItem(billItem);
//	    	
//	    	UpdateBillItem(billItem);
	    	
	    	BillItemDetail billItemDetail=new BillItemDetail();
	    	billItemDetail.setItemID(1);
	    	billItemDetail.setItemDesc("我的工资啊");
	    	AddBillItem(billItemDetail);
	    }
	    
	    public static void AddBillItem(BillItemDetail billItemDetail) {
			SqlSession session = sqlSessionFactory.openSession();
	        try {
	        	IBillItemDetailOperation billItemDetailOperation=session.getMapper(IBillItemDetailOperation.class);
	        	billItemDetailOperation.addBillItem(billItemDetail);
	        	session.commit();
	        } finally {
	        session.close();
	        }
		}
	    
	    public static void UpdateBillItem(BillItem billItem) {
			SqlSession session = sqlSessionFactory.openSession();
	        try {
	        	IBillItemOperation billItemOperation=session.getMapper(IBillItemOperation.class);
	        	billItemOperation.updateBillItem(billItem);
	        	session.commit();
	        } finally {
	        session.close();
	        }
		}
	    
	    
		public static void DeleteBillItem(int itemID) {
			SqlSession session = sqlSessionFactory.openSession();
	        try {
	        	IBillItemOperation billItemOperation=session.getMapper(IBillItemOperation.class);
	        	billItemOperation.deleteBillItem(itemID);
	        	session.commit();
	        } finally {
	        session.close();
	        }
		}

		public static BillItem GetBillItemByID(int itemID) {
			SqlSession session = sqlSessionFactory.openSession();
	        try {
	        	IBillItemOperation billItemOperation=session.getMapper(IBillItemOperation.class);
	        	BillItem billItem =billItemOperation.selectBillItemByID(itemID);
	        	return billItem;
	        } finally {
	        session.close();
	        }
		}
		

		public static void AddBillItem(BillItem billItem) {
			SqlSession session = sqlSessionFactory.openSession();
	        try {
	        	IBillItemOperation billItemOperation=session.getMapper(IBillItemOperation.class);
	        	billItemOperation.addBillItem(billItem);
	        	session.commit();
	        } finally {
	        session.close();
	        }
		}
	    
	    public static void getUserList(String userNmae){
	    	SqlSession session = sqlSessionFactory.openSession();
	    	  try {
		        	IBillItemOperation billItemOperation=session.getMapper(IBillItemOperation.class);
		        	List<BillItem> billItems =billItemOperation.selectBillItems(userNmae);
			        for (BillItem billItem:billItems) {
			        	System.out.println(billItem.getItemID() +billItem.getItemName());
					}
		        } finally {
		        session.close();
		        }
	    }
}
