package dto;

import java.util.ArrayList;
import java.util.List;

public class SelctedDetailsForCountryWrapper {
	
	private ArrayList<SelctedDetailsForCountry> selectedList = new ArrayList<SelctedDetailsForCountry>();
	
	// getter
	public List<SelctedDetailsForCountry> getSelectedList(){
		return selectedList;
	}
	
	//setter
	public void setSelectedList(ArrayList<SelctedDetailsForCountry> input){
		this.selectedList = input;
	}
	
}
