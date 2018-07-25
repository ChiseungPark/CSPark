package dto;

public class SelctedDetails {

	private String selectedGroup = null;
	private String selectedProcess = null;
	private String selectedTarget1= null;
	private String selectedTarget2= null;
	
	public void setSelectedGroup(String input){
		this.selectedGroup = input;
	}
	public String getSelectedType(){
		return selectedGroup;
	}
	
	public void setSelectedProcess(String input){
		this.selectedProcess = input;
	}
	public String getSelectedProcess(){
		return selectedProcess;
	}
	
	public void setSelectedTarget1(String input){
		this.selectedTarget1 = input;
	}
	public String getSelectedTarget1(){
		return selectedTarget1;
	}
	
	public void setSelectedTarget2(String input){
		this.selectedTarget2 = input;
	}
	public String getSelectedTarget2(){
		return selectedTarget2;
	}
	
	
}
