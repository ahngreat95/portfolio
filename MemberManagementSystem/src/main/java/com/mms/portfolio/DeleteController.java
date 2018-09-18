package com.mms.portfolio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteController {

	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("delete.do")
	public String insert(MemberDTO memberDTO) throws Exception {
		memberDAO.delete(memberDTO);
		return "deleteResult";
	}
}






