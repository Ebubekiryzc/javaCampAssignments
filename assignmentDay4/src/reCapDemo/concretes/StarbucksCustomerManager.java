package reCapDemo.concretes;

import reCapDemo.abstracts.CustomerCheckService;
import reCapDemo.abstracts.CustomerManager;
import reCapDemo.entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

	private CustomerCheckService customerChecker;

	public StarbucksCustomerManager(CustomerCheckService customerChecker) {
		this.customerChecker = customerChecker;
	}

	@Override
	public void Save(Customer customer) {
		if (customerChecker.checkIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Hata!");
		}
	}

	public CustomerCheckService getCustomerChecker() {
		return customerChecker;
	}

	public void setCustomerChecker(CustomerCheckService customerChecker) {
		this.customerChecker = customerChecker;
	}

	// Normalde b�t�n kontrol� burada ger�ekle�tirebiliriz ancak yar�n Nero da
	// ayn�s�n� isterse tekrara d��eriz.
	/*
	 * private void checkIfRealPerson(Customer customer) {
	 * 
	 * }
	 */

}
