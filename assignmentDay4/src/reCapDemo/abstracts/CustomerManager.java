package reCapDemo.abstracts;

import reCapDemo.entities.Customer;

public abstract class CustomerManager implements CustomerService{
	public void Save(Customer customer) {
		System.out.println(customer.getFirstName()+" veri tabanýna eklendi!");
	}
}
