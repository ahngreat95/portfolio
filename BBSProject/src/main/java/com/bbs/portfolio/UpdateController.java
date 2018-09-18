package com.bbs.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpdateController {

	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("update.do")
	public String update(BbsDTO bbsDTO) {
		bbsDAO.update(bbsDTO);
		return "updateResult";
	}
}
