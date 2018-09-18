package com.mms.portfolio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class updateController {

	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("updateAllFinal.do") 
	public String updateAllFinal(MemberDTO memberDTO) throws Exception {
			memberDAO.updateAll(memberDTO);
			return "updateResult";
		}
		
	@RequestMapping("updateAll.do")
	public String updateAll(MemberDTO memberDTO, Model model) throws Exception {
		MemberDTO memberDTO2 = memberDAO.select(memberDTO);
		model.addAttribute("memberDTO2", memberDTO2);
		return "updateAllSelect";
	}
	
	@RequestMapping("update.do")
	public String update(MemberDTO memberDTO) throws Exception {
		memberDAO.update(memberDTO);
		return "updateResult";
	}
}






