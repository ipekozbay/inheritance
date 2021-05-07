package tradeSite.core.concretes;

import tradeSite.core.abstracts.GoogleService;

import tradeSite.entities.concretes.User;
import tradeSite.googleAccount.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	public void logIn(User user) {

		GoogleManager googleManager = new GoogleManager();
		googleManager.logIn(user);

	}

}
