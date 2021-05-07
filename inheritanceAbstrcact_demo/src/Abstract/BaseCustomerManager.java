package Abstract;

import Enitities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	public void Save(Customer customer) {
		System.out.println("saved to db " + customer.getFirstName()+ " "+ customer.getLastName());
	}

}
