package reCapDemo.concretes;

import reCapDemo.abstracts.CustomerCheckService;
import reCapDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	// Fake Mernis
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
