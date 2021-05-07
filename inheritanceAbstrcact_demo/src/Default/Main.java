package Default;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Enitities.Customer;
import Concrete.*;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager()); 


		Customer ipek = new Customer();
		ipek.setId(3);
		ipek.setFirstName("ipek");
		ipek.setLastName("özbay");
		ipek.setDateOfBirth(1444);
		ipek.setNationalityId("1414144");

		baseCustomerManager.Save(ipek);
	}
}