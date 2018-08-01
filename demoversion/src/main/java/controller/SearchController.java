package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.SelctedDetails;
import dto.TemplateForSearch;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	private String selectedGroupOption = "Country";
	
	@RequestMapping(method = RequestMethod.GET)
	public String selectWhatToDoNext(Model model){
	
		List<TemplateForSearch> searchTemplate = createTemplateForSearch();
		model.addAttribute("template1", searchTemplate);
		// 이 부분에서 country인지 company 인지 결정한다.
		return "search";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("selectedDetails") SelctedDetails data){
		return "redirect:/main";
	}
	
	//
	private List<TemplateForSearch> createTemplateForSearch(){
		TemplateForSearch t1 = new TemplateForSearch("About what group, do you want to know?",Arrays.asList("Country","Company"));
		return Arrays.asList(t1);
	}
}
