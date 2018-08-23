package dto;

public class StringTest {
	
	private String context = "12345";
	
	public StringTest(String input){
		this.context = input;
	}
	
	public String getContext(){
		return context;
	}
	public void setContext(String input){
		this.context = input;
	}

}
