package dto;

public class CountryActionsAndNumbers {
	
	private String countryName = null;
	private String countryAction = null;
	private String[] countryNumbers = null;
	
	public CountryActionsAndNumbers(String name, String action, String[] numbers){
		this.countryName = name;
		this.countryAction = action;
		this.countryNumbers = numbers;
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
	public String[] getCountryNumbers(){
		return countryNumbers;
	}
	public void setCountryNumbers(String[] input){
		this.countryNumbers = input;
	}
}
