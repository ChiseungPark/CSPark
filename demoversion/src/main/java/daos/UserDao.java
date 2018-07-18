//////////////////////////////////////////////////////
// 2018.07.02  
// This is test code for prototype
// Purpose of this class
//
// Explanation over the code as below 
// 이 부분에 DataSource를 룩업하는 부분을 구현해야 한다.
// http://www.codejava.net/frameworks/spring/configuring-spring-mvc-jdbctemplate-with-jndi-data-source-in-tomcat 참고
//////////////////////////////////////////////////////

package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

//import javax.enterprise.context.spi.Context;
import javax.sql.DataSource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import modules.actions.Users;


public class UserDao {
		
	
	private JdbcTemplate jdbcTemplate;
	
	
	public UserDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	 
	public Users selectByEmail(String email){
		
		// 스프링에서는 주입받는 객체를 사용자가 초기화 하면 null point 익셉션이 떨어짐
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Users> results = jdbcTemplate.query(
				"select * from memberlist where email = ?",
				new RowMapper<Users>() {
					@Override
					public Users mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Users users = new Users(rs.getString("email"),
								rs.getString("password"),
								rs.getString("nickname"),
								rs.getTimestamp("firstRegisterDate"));
						return users;
					}
				},
				email);
		
		System.out.print(results);
		return results.isEmpty() ? null : results.get(0);
		//return results.get(0);
		
	}
	
	public String checkUserByEmail(String email){
		
		
		List<Users> results = jdbcTemplate.query(
				"select * from memberlist where email = ?",
				new RowMapper<Users>() {
					@Override
					public Users mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Users users = new Users(rs.getString("email"),
								rs.getString("password"),
								rs.getString("nickname"),
								rs.getTimestamp("firstRegisterDate"));
						return users;
					}
				},
				email);
		
		System.out.print(results);
		return results.isEmpty() ? "NotExisting" : "Existing" ;
		
	}
	public void insert(final Users anUser) {
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@SuppressWarnings("deprecation")
			@Override
			public PreparedStatement createPreparedStatement(Connection con) 
					throws SQLException {
				PreparedStatement pstmt = con.prepareStatement(
						"insert into memberlist (email, password, nickname, firstRegisterDate) "+
						"values (?, ?, ?, ?)");
				pstmt.setString(1,  anUser.getEmail());
				pstmt.setString(2,  anUser.getPassword());
				pstmt.setString(3,  anUser.getNickname());
				pstmt.setTimestamp(4,  
						new Timestamp(anUser.getFirstRegisterDate().getDate()));
				return pstmt;
			}
		}, keyHolder);
		Number keyValue = keyHolder.getKey();
		anUser.setEmail(keyValue.toString());
	}
	
	public void update(Users anUser) {
		
		jdbcTemplate.update("update memberlist set nickname = ?, password = ? where email = ?",
				anUser.getNickname(), anUser.getPassword(), anUser.getEmail());
	}

	public List<Users> selectAll() {
		
		List<Users> results = jdbcTemplate.query("select * from memberlist",
				new RowMapper<Users>() {
					@Override
					public Users mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Users anUser = new Users(rs.getString("email"),
								rs.getString("password"),
								rs.getString("nickname"),
								rs.getTimestamp("firstRegisterDate"));
						return anUser;
					}
				});
		return results;
	}

	public int getcount() {
		
		Integer count = jdbcTemplate.queryForObject("select count(*) from memberlist", Integer.class);
		return count;
	}
		
}
