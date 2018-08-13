package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryProcessController {
	
	@RequestMapping(value="/countryprocess")
	public String countryProcess(Model model,HttpServletRequest request){
		return "countryprocess";
	}

}
