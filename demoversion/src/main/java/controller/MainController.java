//////////////////////////////////////////////////////
// 2018.07.02  
// This is test code for prototype
// Purpose of this class
//
// Explanation over the code as below 
// 
//
//////////////////////////////////////////////////////

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}

}
