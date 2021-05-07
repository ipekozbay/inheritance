package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Enitities.Customer;

public abstract class NeroCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

    public void Save(Customer customer) 
    {
   
    } 
}


