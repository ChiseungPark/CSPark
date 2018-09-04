package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RserveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import daos.CountryDao;
import dto.CountryActionsAndNumbers;
import dto.SimpleString;
import r.Rcommand;

@Controller
public class CountryProcessController {
	
	private String nextPath = "stay"; //스트링 초기 값은 null이 안되게 하나로 정해주고 시작함.
	private String previousSelection = null;
	private String[] selectionParts = null;
	private String[][] selectedNumbers = null;
	private String[] summaryContents = {"1","2"};
	private String errorCode ="";
	private String getMsg = "";
	
	@Autowired
	public CountryDao countryDao;
	
	Rcommand rCommand = new Rcommand();
	
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
			
			// 표현하는 데이터 부분
			for(int i=0;i<((selectionParts.length)/2);i++){
				
				// 선택된 항목에 대해서 DB조회를 한 후 필요한 나라및 세부항목에 대한 숫자를 채운다.
				CountryActionsAndNumbers tmpObject = new CountryActionsAndNumbers(selectionParts[2*i],selectionParts[2*i+1],
						countryDao.getNumbersFromCountryData(selectionParts[2*i],selectionParts[2*i+1]));			
				selectedList.add(i,tmpObject);
				// 숫자들만 따로 이중배열로 만든다.
				int columnNumber = 0;
				columnNumber = countryDao.getColumnNumber(selectionParts[2*i],selectionParts[2*i+1]);
				for(int ii=0;ii<columnNumber;ii++){
					selectedNumbers[i][ii] = countryDao.getNumbersFromCountryData(selectionParts[2*i],selectionParts[2*i+1]).get(ii);
				}		
			}
			model.addAttribute("selectedList1", selectedList);
			
			/*
			// 데이터 각각의 평균/분산등의 서머리
			try{
				// R에 전송할 때 문자가 들어가면 에러가 발생하고 행이 걸린다.
				String[] resultOfEach = rCommand.rSummary(selectedNumbers);
				
			}
			// catch 문에는 익셉션 발생 시 리턴값이 있어야 한다.
			catch(RserveException e){
				errorCode = "RserveException";
				getMsg = e.getMessage();
				SimpleString strResult = new SimpleString(errorCode);
				model.addAttribute("errorcode", strResult);
				return "error";
			}
			catch(REXPMismatchException e){
				errorCode = "REXPMismatchException";
				getMsg = e.getMessage();
				SimpleString strResult = new SimpleString(errorCode);
				model.addAttribute("errorcode", strResult);
				return "error";
			}
			catch(FileNotFoundException e){
				errorCode = "FileNotFoundException";
				getMsg = e.getMessage();
				SimpleString strResult = new SimpleString(errorCode);
				model.addAttribute("errorcode", strResult);
				return "error";
			}
			catch(IOException e){
				errorCode = "IOException";
				getMsg = e.getMessage();
				SimpleString strResult = new SimpleString(errorCode);
				model.addAttribute("errorcode", strResult);
				return "error";
			}
			*/
		}
		else
		{
			//nothing to do.
		}
		
		// 다음 화면 및 같은 화면 내에서 사용자의 요청에 대응하는 로직
		if(nextPath.contains("next"))
			return "main";
		else if(nextPath.contains("Basic") == true){
			// 여기에서 R에 파라미터를 전달해서 값을 받아온다.
			// String[] 파라미터로 넣고 String[]를 결과로 받는다.
			for(int index=0;index<(selectionParts.length)/2;index++){
				
			}
			model.addAttribute("summary", summaryContents);
			return "countryprocess";
		}
		else
			return "countryprocess";
	}

}
