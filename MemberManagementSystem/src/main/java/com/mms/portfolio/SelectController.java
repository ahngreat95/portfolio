package com.mms.portfolio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SelectController {

	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("selectAll.do")
	public String selectAll(Model model) throws Exception {
		List<MemberDTO> list = memberDAO.selectAll();
		model.addAttribute("list", list);
		return "selectAllResult";
	}
	
	
	@RequestMapping("select.do")
	public String select(MemberDTO memberDTO, Model model) throws Exception {
		MemberDTO memberDTO2 = memberDAO.select(memberDTO);
		model.addAttribute("memberDTO2", memberDTO2);
		return "selectResult";
	}
}





