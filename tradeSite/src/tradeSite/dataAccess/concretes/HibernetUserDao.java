package tradeSite.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import tradeSite.dataAccess.abstracts.UserDao;
import tradeSite.entities.concretes.User;

public class HibernetUserDao implements UserDao {

	private List<User> users = new ArrayList<User>();

	@Override
	public void logIn(User user) {
		System.out.println("hibernet ile giri� yap�ld� " + user.getName() + user.getLastName());

	}

	@Override
	public void register(User user) {
		System.out.println("hibernet ile kay�t olundu " + user.getName() + user.getLastName());

	}

	@Override
	public void findUser(User user) {
		System.out.println("kulln�c� bulundu " + user.getName() + user.getLastName());

	}

	@Override
	public User getByMail(String mail) {

		for (User user : users) {
			if (user.geteMail() == mail)
				return user;
		}

		return null;
	}

	@Override
	public List<User> getAll() {

		return null;
	}

}
