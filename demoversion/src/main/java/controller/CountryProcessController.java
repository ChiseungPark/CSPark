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
import dto.SelctedDetailsForCountry;
import dto.StringTest;

@Controller
public class CountryProcessController {
	
	private String countryName = "KOR";
	private String detailedAction = "Population_total";
	private String nextPath = null;
	private String previousSelection = null;
	private String[] selectionParts = null;
	private int nIndex = 0;
	
	@Autowired
	public CountryDao countryDao;
	
	@RequestMapping(value="/countryprocess")
	public String countryProcess(Model model,
								HttpServletRequest request){
		
		// 이 경우 selectedList는 내부적으로 또 다른 ArrayList를 가지고 있는 2중 구조의 ArrayList가 된다.
		// tmp 리스트는 테스트를 위해서 설정함.
		List<CountryActionsAndNumbers> selectedList = new ArrayList<CountryActionsAndNumbers>();
		List<SelctedDetailsForCountry> tmpList = new ArrayList<SelctedDetailsForCountry>();
		
		if(request.getParameter("totalcountryResult")!=null){
			// 이 부분까지 정확히 들어오는 것은 확인함.
			previousSelection = request.getParameter("totalcountryResult");
			selectionParts = previousSelection.split("pchis");
		}
		else{
			previousSelection = "input request is null";
		}
		
		StringTest testSample= new StringTest(previousSelection);
		
		////////////////////////////////////////////////////////////////////////////////////////
		// 테스트 및 비교를 위해서 test를 설정함. ( 이건 되는 것을 확인함)
		if(selectionParts[0].isEmpty() != true){
			
			for(int index=0;index<((selectionParts.length)/2);index++){
			tmpList.add(index,new SelctedDetailsForCountry(selectionParts[2*index],selectionParts[2*index+1]));
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////
		// countryDao.getNumbersFromCountryData 까지는 쿼리가 제대로 들어가는 것을 확인함.
		
		if(selectionParts[0].isEmpty() != true){
			
			for(int i=0;i<((selectionParts.length)/2);i++){
				
				// 선택된 항목에 대해서 DB조회를 한 후 필요한 나라및 세부항목에 대한 숫자를 채운다.
				CountryActionsAndNumbers tmpObject = new CountryActionsAndNumbers(selectionParts[2*i],selectionParts[2*i+1]);
				tmpObject.setCountryNumbers(countryDao.getNumbersFromCountryData(selectionParts[2*i],selectionParts[2*i+1]));
				
				selectedList.add(i,tmpObject);
						
			}
			// jsp에서 selectedList를 어떻게 보여줄 지 foreach로 확인해야한다.
			//model.addAttribute("selectedList1", selectedList);
			model.addAttribute("test", tmpList);
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
