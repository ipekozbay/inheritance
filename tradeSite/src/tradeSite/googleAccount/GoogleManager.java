package tradeSite.googleAccount;

import tradeSite.entities.concretes.User;

public class GoogleManager {

	public void logIn(User user) {
		System.out.println("google hesab�n�z ile kaydoldunuz " + user.getName() + user.getLastName());
	}

}
