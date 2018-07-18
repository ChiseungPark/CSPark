//////////////////////////////////////////////////////
// 2018.07.02  
// This is test code for prototype
// Purpose of this class
//
// Explanation over the code as below 
// User에 대한 Atrributes와 Get/Set을 가지고 있는 Bean 개념의 객체로 DTO 개념을 가진다.
// 
//////////////////////////////////////////////////////
package modules.actions;

import java.util.Date;

public class Users {
	
	private String email = null;
	private String password = null;
	private String nickname = null;
	private Date firstRegisterDate = null;
	
	// 생성자로 4개의 인자(이메일/비밀번호/닉네임/마지막접속시간)를 가진다.
	public Users(String email, String password, String nickname, Date inputTime){
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.firstRegisterDate = inputTime;
		
	}
	
	// setters & getters by each Attribute
	// by eamil
	public void setEmail(String email){
		this.email = email;		
	}
	public String getEmail(){
		return this.email;
	}
	
	// by password
	public void setPassword (String password){
		this.password = password;
	}
	public String getPassword(){
		return this.password;
	}
	
	// by nickname
	public void setNickname(String name){
		this.nickname = name;
	}
	public String getNickname(){
		return this.nickname;
	}
	
	// by first register date
	public void setFirstRegisterDate(Date date){
		this.firstRegisterDate = date;
	}
	public Date getFirstRegisterDate(){
		return this.firstRegisterDate;
	}
}
