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

	// Normalde bütün kontrolü burada gerçekleþtirebiliriz ancak yarýn Nero da
	// aynýsýný isterse tekrara düþeriz.
	/*
	 * private void checkIfRealPerson(Customer customer) {
	 * 
	 * }
	 */

}
