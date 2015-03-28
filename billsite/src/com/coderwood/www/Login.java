package com.coderwood.www;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {
	
	@RequestMapping("/login")	
	public String login(String username,String password,Model model){
		if(username.equals("coderwood")){
			return "listiteminfo.spring";
		}
		else{
			return "index.jsp";
		}
	}

}
