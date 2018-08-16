package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryProcessController {
	
	private String countryName = "KOR";
	private String detailedAction = "Population_total";
	private String nextPath = null;
	private String previousSelection = null;
	private String[] selectionParts = null;
	
	@RequestMapping(value="/countryprocess")
	public String countryProcess(Model model,HttpServletRequest request){
		
		previousSelection = request.getParameter("totalcountryResult");
		nextPath = request.getParameter("next");
		selectionParts = previousSelection.split("-"); //홀수는 국가이름 짝수는 액션이름
		
		
		
		if(nextPath == null)
			return "countryprocess";
		else
			return "main";
	}

}
