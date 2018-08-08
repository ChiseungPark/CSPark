package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import daos.UserDao;

@Controller
public class LoginController {
	
	@Autowired
	public UserDao userDao;
	
	@RequestMapping(value="/login")
	public String loginHandler (@RequestParam(required=false, value="email") String tmpEmail, 
			@RequestParam(required=false, value="password") String tmpPassword) {
		//System.out.print(userDao.getcount());
		/**/
		//일단 DB에 있는 사용자 명단을 입력받은 로그인의 req와 비교하여 명단이 있으면 다음단계로 진행시킨다.
		//System.out.println(tmpPassword);
		if(userDao.checkUserByEmail(tmpEmail) == "Existing"){			
			return "redirect:/GroupSellection";
		}
		else{
			return "login";
		}		
	}
}
