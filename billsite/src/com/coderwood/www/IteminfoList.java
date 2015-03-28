package com.coderwood.www;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coderwood.Entity.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

@Controller
public class IteminfoList {

	@RequestMapping("/showiteminfo")
	public ModelAndView ShowIteminfo() {
		Iteminfo iteminfo1=new Iteminfo();
		iteminfo1.ItemName="啊哈";
		iteminfo1.ItemID=11;
		
		ModelAndView view=new ModelAndView("ItemDetail.jsp");
		view.addObject("iteminfo1", iteminfo1);
		return view;
	}
	
	@RequestMapping("/listiteminfo")
	public ModelAndView ListIteminfo() {
		Iteminfo iteminfo1=new Iteminfo();
		iteminfo1.ItemID=11;
		
		ModelAndView view=new ModelAndView("itemlist.jsp");
		view.addObject("iteminfo1", iteminfo1);
		return view;
	
	}

	public List GetItemList() {
		String url = "jdbc:mysql://114.215.154.9:3306/billing";
		String user = "root";
		String password = "topgroup";
		List iteminfoList = new ArrayList();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
		}
		

		try {
			Connection conn = (Connection) DriverManager.getConnection(url,
					user, password);
			Statement statement = (Statement) conn.createStatement();
			String sql = "SELECT * FROM iteminfo";
			ResultSet rs = statement.executeQuery(sql);
			ResultSetMetaData rmeta = (ResultSetMetaData) rs.getMetaData();
			while (rs.next()) {
				Iteminfo iteminfo = new Iteminfo();
				iteminfo.ItemID = Integer.parseInt(rs.getString(1));
				iteminfo.ItemName = rs.getString(2);
				iteminfo.Itemsort = Integer.parseInt(rs.getString(3));
				// iteminfo.dataCreateTime=rs.getString(5);
				iteminfoList.add(iteminfo);
			}
			rs.close();
			statement.close();
			conn.close();
			return iteminfoList;

		} catch (SQLException e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
		}
		return iteminfoList;
		
	}
}
