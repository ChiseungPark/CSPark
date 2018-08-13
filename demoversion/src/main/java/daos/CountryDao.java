//////////////////////////////////////////////////////
// 2018.07.02  
// This is test code for prototype
// Purpose of this class
//
// Explanation over the code as below 
// 데이터베이스에서 R에 전송할 table을 만드는 역할을 한다
// 실제 DTO 패키지의 TemplateXX를 가지고 R에 넘겨줄 데이터를 만들어준다.
//////////////////////////////////////////////////////

package daos;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CountryDao {		
	
	private String nation ="";
	private String action ="";
	private JdbcTemplate jdbcTemplate;
	private String dbTableName = "";
	
	public CountryDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	// 이 부분에는 Nation 이나 Company에 대한 DTO를 기반으로 JdbcTemplate을 만든다. 
	
	public String selectNationDetails(String nation, String Details){
		// 이 부분에 query가 들어간다.
		
		return "nothing";
		
	}

}


	



