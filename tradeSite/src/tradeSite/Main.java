package tradeSite;

import tradeSite.business.abstracts.UserService;
import tradeSite.business.concretes.UserManager;
import tradeSite.core.abstracts.GoogleService;
import tradeSite.core.concretes.GoogleManagerAdapter;
import tradeSite.dataAccess.concretes.HibernetUserDao;
import tradeSite.entities.concretes.User;
import tradeSite.googleAccount.GoogleManager;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HibernetUserDao(), new GoogleManagerAdapter());

		userService.register(new User("ipek ", "özbay", "ipek@gmail.com", "1234567"));
		userService.register(new User("ali ", "veli", "aa", "1234567"));
		userService.register(new User("ahmet ", "mehmet", "aa@gmail.com", "1234567"));

		User user_1 = new User("ayþe ", "ayþe", "ayseayse@gmail.com", "145414");
		GoogleManager googleManager = new GoogleManager();
		googleManager.logIn(user_1);

	}

}
