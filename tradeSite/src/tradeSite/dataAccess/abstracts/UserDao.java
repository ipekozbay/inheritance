package tradeSite.dataAccess.abstracts;
import java.util.List;
import tradeSite.entities.concretes.User;


public interface UserDao {

	void register(User user);
	void logIn(User user);
	void findUser(User user);
	
	User getByMail(String name);

	List<User> getAll();

}
