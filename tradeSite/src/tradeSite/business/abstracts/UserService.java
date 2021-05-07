package tradeSite.business.abstracts;

import java.util.List;

import tradeSite.entities.concretes.User;

public interface UserService {
	
	void logIn(User user);
	void register(User user);
	
	User getByMail(String mail);
	List<User> getAll();
	
}
