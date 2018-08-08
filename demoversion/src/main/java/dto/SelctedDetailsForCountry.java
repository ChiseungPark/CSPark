package dto;

public class SelctedDetailsForCountry {

	private String selectedGroup = null;
	private String selectedSubCategory = null;
	
	// 인스턴스를 만들면서 바로 변수에 할당을 할 수 있도록 세팅한다.
	public SelctedDetailsForCountry(String inputForGroup, String inputForSubCategory){
		
		this.selectedGroup = inputForGroup;
		this.selectedSubCategory = inputForSubCategory;
	}
	
	public void setSelectedGroup(String input){
		this.selectedGroup = input;
	}
	public String getSelectedType(){
		return selectedGroup;
	}
	
	public void setSelectedSubCategory(String input){
		this.selectedSubCategory = input;
	}
	public String getSelectedSubCategory(){
		return selectedSubCategory;
	}
	
}
