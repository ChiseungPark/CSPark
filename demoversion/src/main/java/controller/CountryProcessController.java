package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.CountryActionsAndNumbers;

@Controller
public class CountryProcessController {
	
	private String countryName = "KOR";
	private String detailedAction = "Population_total";
	private String nextPath = null;
	private String previousSelection = countryName+"-"+detailedAction;
	private String[] selectionParts = null;
	public int nIndex = 0;
	public ArrayList<CountryActionsAndNumbers> selectedList = new ArrayList<CountryActionsAndNumbers>();
	
	@RequestMapping(value="/countryprocess")
	public String countryProcess(Model model,HttpServletRequest request){
		
		previousSelection = request.getParameter("totalcountryResult");
		nextPath = request.getParameter("next");
		selectionParts = previousSelection.split("-"); //짝수는 국가이름 홀수는 액션이름
		nIndex = selectionParts.length; // 몇개의 인덱스가 존재하는지 계산한다.
		
		if(previousSelection.isEmpty() != true){
			for(int i=0;2*i<nIndex;i++){
				String[] tmpNumbers = null;
				// 이 부분에서 tmpNumbers에 DB로부터 나라및 세부항목에 대한 숫자를 채운다.
				selectedList.add(i, new CountryActionsAndNumbers(selectionParts[2*i],selectionParts[2*i+1],tmpNumbers));
			}
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
