package Concrete;

import Abstract.CustomerCheckService;
import Enitities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
}