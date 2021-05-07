package gameProject.concretes;

import gameProject.abstracts.CustomerCheckService;
import gameProject.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if (customer.getNationalId().length() == 11) {
			return true;
		} else {
			return false;
		}
	}

}
