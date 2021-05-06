package reCapDemo.abstracts;

import reCapDemo.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
