package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.CountryActionsAndNumbers;
import dto.StringTest;

@Controller
public class CountryProcessController {
	
	private String countryName = "KOR";
	private String detailedAction = "Population_total";
	private String nextPath = null;
	private String previousSelection = null;
	private String[] selectionParts = null;
	private int nIndex = 0;
	
	
	
	@RequestMapping(value="/countryprocess")
	public String countryProcess(Model model,
								HttpServletRequest request){
		
		ArrayList<CountryActionsAndNumbers> selectedList = new ArrayList<CountryActionsAndNumbers>();
		
		if(request.getParameter("totalcountryResult")!=null){
			// 이 부분까지 정확히 들어오는 것은 확인함.
			previousSelection = request.getParameter("totalcountryResult");
			selectionParts = previousSelection.split("pchis");
		}
		else{
			previousSelection = "input request is null";
		}
		
		StringTest testSample= new StringTest(previousSelection);
		
		if(selectionParts[0].isEmpty() != true){
			for(int i=0;i<((selectionParts.length)/2);i++){
				
				// 이 부분에 DB조회에 필요한 나라및 세부항목에 대한 정보 및 해당하는 숫자를 채운다.
				selectedList.add(i, new CountryActionsAndNumbers(selectionParts[2*i],selectionParts[2*i+1]));
			}
			model.addAttribute("selectedList1", selectedList);
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
