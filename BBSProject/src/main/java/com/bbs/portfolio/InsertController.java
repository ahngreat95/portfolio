package com.bbs.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {

	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping
	public String insert(BbsDTO bbsDTO) {
		bbsDAO.insert(bbsDTO);
		return "insertResult";
	}
}
