package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.SelctedDetailsForCountry;
import dto.SelctedDetailsForCountryWrapper;
import dto.StringTest;

@Controller
public class CountryProcessController {
	
	private String countryName = "KOR";
	private String detailedAction = "Population_total";
	private String nextPath = null;
	private String previousSelection = null;
	private String[] selectionParts = null;
	public int nIndex = 0;
	
	
	@RequestMapping(value="/countryprocess")
	public String countryProcess(Model model,
								HttpServletRequest request){
		
		if(request.getParameter("totalcountryResult")!=null){
			previousSelection = request.getParameter("totalcountryResult");
		}
		else{
			previousSelection = "input request is null";
		}
		
		StringTest testSample= new StringTest(previousSelection);
		
		if(previousSelection.isEmpty() != true){
			/*for(int i=0;2*i<nIndex;i++){
				String[] tmpNumbers = {"100","200","300"};
				// 이 부분에서 tmpNumbers에 DB로부터 나라및 세부항목에 대한 숫자를 채운다.
				selectedList.add(i, new CountryActionsAndNumbers(selectionParts[2*i],selectionParts[2*i+1],tmpNumbers));
			}*/
			//model.addAttribute("selectedList1", mylist);
			model.addAttribute("selectedList2", testSample);
		}
		else
		{
			//nothing to do.
		}
		
		// 다음 화면으로 이동하는 로직
		if(nextPath == null)
			return "countryprocess";
		else
			return "main";
	}

}
