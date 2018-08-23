package dto;

import java.util.ArrayList;

public class SelctedDetailsForCountry {

	private String selectedCountry = null;
	private String selectedSubCategory = null;
	//private ArrayList<SelctedDetailsForCountry> thisList = null;
	
	// 인스턴스를 만들면서 바로 변수에 할당을 할 수 있도록 세팅한다.
	public SelctedDetailsForCountry(String inputForCountry, String inputForSubCategory){
		
		this.selectedCountry = inputForCountry;
		this.selectedSubCategory = inputForSubCategory;
	}
	
	public void setSelectedCountry(String input){
		this.selectedCountry = input;
	}
	public String getSelectedCountry(){
		return selectedCountry;
	}
	
	public void setSelectedSubCategory(String input){
		this.selectedSubCategory = input;
	}
	public String getSelectedSubCategory(){
		return selectedSubCategory;
	}
	
	/*
	// List 포인터를 셋팅 및 반환하는 함수
	public void setThisList(ArrayList<SelctedDetailsForCountry> input){
		this.thisList = input;
	}
	public ArrayList<SelctedDetailsForCountry> getThisList(){
		return this.thisList;
	}
	*/
	public boolean isChoice() {
		return selectedSubCategory != null && !selectedSubCategory.isEmpty();
	}
	
}
