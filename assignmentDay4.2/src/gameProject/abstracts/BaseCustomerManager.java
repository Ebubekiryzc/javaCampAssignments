package gameProject.abstracts;

import gameProject.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kullan�c�s� sisteme eklendi!");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kullan�c�s�n�n bilgileri g�ncellendi!");
	}

	@Override
	public void remove(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kullan�c�s� sistemden silindi!");
	}
	
}
