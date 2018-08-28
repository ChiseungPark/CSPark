package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.CountryDao;
import dto.CountryActionsAndNumbers;

@Controller
public class CountryProcessController {
	
	private String nextPath = "stay"; //스트링 초기 값은 null이 안되게 하나로 정해주고 시작하자.
	private String previousSelection = null;
	private String[] selectionParts = null;
	
	@Autowired
	public CountryDao countryDao;
	
	@RequestMapping(value="/countryprocess")
	public String countryProcess(Model model,
								HttpServletRequest request){
		
		List<CountryActionsAndNumbers> selectedList = new ArrayList<CountryActionsAndNumbers>();
		
		// 처음 기본 화면에 대한 로직
		if(request.getParameter("nextpath") !=null){
			nextPath = request.getParameter("nextpath");
		}
				
		if(request.getParameter("totalcountryResult")!=null){
			previousSelection = request.getParameter("totalcountryResult");
			selectionParts = previousSelection.split("pchis");
		}
		else{
			previousSelection = "input request is null";
		}
		
		
		if(selectionParts[0].isEmpty() != true){
			
			for(int i=0;i<((selectionParts.length)/2);i++){
				
				// 선택된 항목에 대해서 DB조회를 한 후 필요한 나라및 세부항목에 대한 숫자를 채운다.
				CountryActionsAndNumbers tmpObject = new CountryActionsAndNumbers(selectionParts[2*i],selectionParts[2*i+1],
						countryDao.getNumbersFromCountryData(selectionParts[2*i],selectionParts[2*i+1]));			
				selectedList.add(i,tmpObject);
						
			}
			model.addAttribute("selectedList1", selectedList);
		}
		else
		{
			//nothing to do.
		}
		
		// 다음 화면 및 같은 화면 내에서 사용자의 요청에 대응하는 로직
		if(nextPath.contains("next"))
			return "main";
		else if(nextPath.contains("Basic") == true){
			
			model.addAttribute("summary", selectedList);
			return "main";
		}
		else
			return "countryprocess";
	}

}
