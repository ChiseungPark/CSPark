package dto;

public class SimpleString {
	
	private String context = "12345";
	
	public SimpleString(String input){
		this.context = input;
	}
	
	public String getContext(){
		return context;
	}
	public void setContext(String input){
		this.context = input;
	}

}
