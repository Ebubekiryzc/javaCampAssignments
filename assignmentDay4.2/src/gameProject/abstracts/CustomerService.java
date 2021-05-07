package gameProject.abstracts;

import gameProject.entities.Customer;

public interface CustomerService {
	void save(Customer customer);

	void update(Customer customer);

	void remove(Customer customer);
}
