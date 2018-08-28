package dto;

import java.util.List;

public class CountryActionsAndNumbers {
	
	private String countryName = null;
	private String countryAction = null;
	private List<String> countryNumbers = null; // 각 국가별 항목별 DB조회값을 하나의 인스턴스에 저장하기 위해서 변수 지정
	
	public CountryActionsAndNumbers(String name, String action, List<String> inputList){
		this.countryName = name;
		this.countryAction = action;
		this.countryNumbers = inputList;
	}
	// getter,setter 함수
	//1
	public String getCountryName(){
		return countryName;
	}
	public void setCountryName(String input){
		this.countryName = input;
	}
	//2
	public String getCountryAction(){
		return countryAction;
	}
	public void setCountryAction(String input){
		this.countryAction = input;
	}
	//3
	public List<String> getCountryNumbers(){
		return countryNumbers;
	}
	public void setCountryNumbers(List<String> inputList){
		this.countryNumbers = inputList;
	}
}
