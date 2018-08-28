//////////////////////////////////////////////////////
// 2018.08.16
// This is test code for prototype
// Purpose of this class
//
// Explanation over the code as below 
// 데이터베이스에서 R에 전송할 데이터를 불러오는 역할을 한다.
//////////////////////////////////////////////////////

package daos;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CountryDao {		
	
	private String nation ="";
	private String action ="";
	private JdbcTemplate jdbcTemplate;
	private String space = " ";
	
	public CountryDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	// 이 부분에는 Nation 이나 Company에 대한 DTO를 기반으로 JdbcTemplate을 만든다. 
	
	public ArrayList<String> getNumbersFromCountryData(String country, String action1){
		nation = country;
		action = action1;
		String query = "select"+space+action+space+"from"+space+"nkordata";//하나씩 공란을 두어야 한다.
		return (ArrayList<String>) jdbcTemplate.queryForList(query, String.class);
		
	}

}


	



