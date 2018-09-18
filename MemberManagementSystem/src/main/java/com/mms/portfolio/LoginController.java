package com.mms.portfolio;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("login.do")
	public String login(MemberDTO memberDTO, HttpSession session) {
		session.setAttribute("id", memberDTO.getId());
		return "loginResult";
	}
}




