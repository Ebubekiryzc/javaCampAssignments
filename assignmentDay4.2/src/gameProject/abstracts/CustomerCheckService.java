package gameProject.abstracts;

import gameProject.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
