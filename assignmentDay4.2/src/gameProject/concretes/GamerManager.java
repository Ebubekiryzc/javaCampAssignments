package gameProject.concretes;

import gameProject.abstracts.BaseCustomerManager;
import gameProject.abstracts.CustomerCheckService;
import gameProject.entities.Customer;

public class GamerManager extends BaseCustomerManager {
	private CustomerCheckService checkService;

	public GamerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		if (checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Hata!");
		}
	}

	@Override
	public void update(Customer customer) {
		if (checkService.checkIfRealPerson(customer)) {
			super.update(customer);
		} else {
			System.out.println("Hata!");
		}
	}

	public CustomerCheckService getCheckService() {
		return checkService;
	}

	public void setCheckService(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
}
