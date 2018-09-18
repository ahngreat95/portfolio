


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mms.portfolio.MemberDAO;
import com.mms.portfolio.MemberDTO;

@Controller
public class updateController {

	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("update.do")
	public String insert(MemberDTO memberDTO) throws Exception {
		memberDAO.update(memberDTO);
		return "updateResult";
	}
}






