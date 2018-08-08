package controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import dto.TemplateForSearch;

@Controller
public class GroupController {
	private String selectedResult1 =null; 
	private String selectedResult2 =null; 
	
	@RequestMapping(value="/GroupSellection")
	public String selectGroup(Model model,HttpServletRequest req, HttpServletResponse res){
		
	
		List<TemplateForSearch> searchTemplate1 = createTemplate1ForSearch();
		model.addAttribute("template1", searchTemplate1);
		selectedResult1 = req.getParameter("Abount Country");
		selectedResult2 = req.getParameter("Abount Company");
		
		if(selectedResult1.isEmpty() != true)
			return "redirect:/search";
		else if (selectedResult2.isEmpty() != true)
			return "redirect:/main";
		else
			return "GroupSellection";
	}
	
	
	private List<TemplateForSearch> createTemplate1ForSearch(){
		TemplateForSearch t1 = new TemplateForSearch("Which category do you want to know?",
				Arrays.asList(  "About Country",
								"About Company"));
		return Arrays.asList(t1);
	}
}
