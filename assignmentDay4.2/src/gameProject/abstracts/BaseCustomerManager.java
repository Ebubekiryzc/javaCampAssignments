package gameProject.abstracts;

import gameProject.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kullanýcýsý sisteme eklendi!");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kullanýcýsýnýn bilgileri güncellendi!");
	}

	@Override
	public void remove(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kullanýcýsý sistemden silindi!");
	}
	
}
