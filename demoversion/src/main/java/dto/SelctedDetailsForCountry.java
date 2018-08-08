package dto;

public class SelctedDetailsForCountry {

	private String selectedCountry = null;
	private String selectedSubCategory = null;
	
	// 인스턴스를 만들면서 바로 변수에 할당을 할 수 있도록 세팅한다.
	public SelctedDetailsForCountry(String inputForGroup, String inputForSubCategory){
		
		this.selectedCountry = inputForGroup;
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
	
}
