package tradeSite.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import tradeSite.business.abstracts.UserService;
import tradeSite.core.abstracts.GoogleService;
import tradeSite.dataAccess.abstracts.UserDao;
import tradeSite.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private GoogleService googleService;

	public static final Pattern Email_Regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public GoogleService getGoogleService() {
		return googleService;
	}

	public void setGoogleService(GoogleService googleService) {
		this.googleService = googleService;
	}

	@Override
	public void register(User user) {

		if (user.getPassword().length() < 6) {
			System.out.println("şifreniz 6 karakterden buyuk olmalıdır .Syn : " + user.getName() + user.getLastName());
			return;
		}

		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());

		if (!matcher.matches()) {
			System.out.println("Mail adresinizin formatı yanlıştır kayıt gerçekleştirilemedi . örn: ipek@ipek.com");
			return;
		}

		if (user.getName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("ad ve soyadınız 2 karakterden uzun olmalıdır");
			return;
		}

		userDao.register(user);

	}

	@Override
	public void logIn(User user) {

		if (user.getPassword().length() >= 6 && user.geteMail() != null) {

			System.out.println("girşininiz başarılı. Syn : " + user.getName() + " " + user.getLastName());
			return;
		}

	}

	@Override
	public List<User> getAll() {

		return null;
	}

	@Override
	public User getByMail(String mail) {

		return null;
	}

}
