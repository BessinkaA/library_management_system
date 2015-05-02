package ie.cit.adf.dao;

import ie.cit.adf.domain.Users;

import java.util.List;

public interface UserRepository {
	
	void addUser(Users user);
	List<Users> getAllUsers();

}
