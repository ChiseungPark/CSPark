package daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SearchTargetDao {
	
private JdbcTemplate jdbcTemplate;
	
	
	public SearchTargetDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void selectByGroup(String group){
			
			// 스프링에서는 주입받는 객체를 사용자가 초기화 하면 null point 익셉션이 떨어짐
			//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			if(group == "country"){
				
								
			}
			else{
				
			}
			
		}
}
