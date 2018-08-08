package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class GroupController {
	
	@RequestMapping(value="/groupSellection", method = RequestMethod.POST)
	public String selectGroup(HttpServletRequest request){
		String result = request.getParameter("group");
		
		if(result!=null){
			
			if(result.equals("country")){
				return "redirect:/search";
			}
			else
				return "redirect:/groupSellection";
		}
		else
			return "groupSellection";
		
	}


}
