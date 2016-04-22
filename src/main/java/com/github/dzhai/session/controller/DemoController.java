package com.github.dzhai.session.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("login")
	public String login(HttpServletRequest request,HttpServletResponse response){
		String username=(String) request.getSession().getAttribute("username");
		if(username==null){
			request.getSession().setAttribute("username", UUID.randomUUID().toString());
			
		}	
		return "index";	
	}
}
