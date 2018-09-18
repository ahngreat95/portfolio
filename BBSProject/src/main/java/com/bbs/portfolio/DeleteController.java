package com.bbs.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteController {

	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("delete.do")
	public String delete(BbsDTO bbsDTO) {
		bbsDAO.delete(bbsDTO);
		return "deleteResult";
	}
}
