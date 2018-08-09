package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GroupController {
	
	@RequestMapping(value="/groupSellection")
	public String selectGroup(HttpServletRequest request){
		String result = request.getParameter("group");
		
		if(result!=null){
			
			if(result.equals("country")){
				return "redirect:/countrysearch";
			}
			else
				return "redirect:/groupSellection";
		}
		else
			return "groupSellection";
		
	}


}
