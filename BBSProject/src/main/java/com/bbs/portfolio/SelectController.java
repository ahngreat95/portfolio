package com.bbs.portfolio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SelectController {

	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("selectAll.do")
	public String selectAll(Model model) throws Exception{
		List<BbsDTO> list = bbsDAO.selectAll();
		model.addAttribute("list", list);
		return "selectAllResult";
	}
	
	@RequestMapping("select.do")
	public String select(BbsDTO bbsDTO, Model model) throws Exception{
		BbsDTO bbsDTO2 = bbsDAO.select(bbsDTO);
		model.addAttribute("bbsDTO2", bbsDTO2);
		return "selectResult";
	}
	
	
}
