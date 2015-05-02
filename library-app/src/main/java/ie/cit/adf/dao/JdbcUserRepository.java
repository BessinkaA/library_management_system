package ie.cit.adf.dao;

import ie.cit.adf.domain.Users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JdbcUserRepository implements UserRepository {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcUserRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void addUser(Users user) {
		jdbcTemplate
				.update("insert into users (userId, userName, userAddress, userCity, userRegistrationDate) values (?,?,?,?,?)",
						user.getUserId(), user.getUserName(),
						user.getUserAddress(), user.getUserCity(),
						user.getUserRegistrationDate());

	}

	public List<Users> getAllUsers() {
		return jdbcTemplate.query("select userId, userName, userAddress, userCity, userRegistrationDate from users",
						new UsersRowMapper());
	}

}

class UsersRowMapper implements RowMapper<Users> {

	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		String user_id = rs.getString("userId");
		String user_name= rs.getString("userName");
		String user_address = rs.getString("userAddress");
		String user_city = rs.getString("userCity");
		String user_registrationDate = rs.getString("userRegistrationDate");
		
		Users user = new Users();
		user.setUserId(user_id);
		user.setUserName(user_name);
		user.setUserAddress(user_address);
		user.setUserCity(user_city);
		user.setUserRegistrationDate(user_registrationDate);
		return user;
	}

}
