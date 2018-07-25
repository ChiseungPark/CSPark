package dto;

import java.util.Collections;
import java.util.List;

public class TemplateForSearch {
	
	private String question;
	private List<String> options;
	
	// 생성자1
	public TemplateForSearch(String input, List<String> options){
		this.question = input;
		this.options = options;
	}
	
	//생성자2
	public TemplateForSearch(String input){
		this.question = input;
		// 질문 List로 넣을 것이 없으면 빈 값을 할당한다.
		this.options = Collections.emptyList(); // List<String> s = Collections.emptyList() 처럼 사용
	}
	
	// get , set of question
	public String getQuestion(){
		return this.question;
	}
	public void setQuestion(String input){
		this.question = input;
	}
	
	// get , set of List<String>
	public List<String> getOptions(){
		return this.options;
	}
	// 이 부분은 데이터 베이스에서 가지고 오도록 밖에서 처리한다.
	public void setOptions(List<String> input){
		this.options = input;
	}
	
	public boolean isChoice() {
		return options != null && !options.isEmpty();
	}
		
}
