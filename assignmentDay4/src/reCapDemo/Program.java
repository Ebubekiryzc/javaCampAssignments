package reCapDemo;

import reCapDemo.abstracts.CustomerManager;
import reCapDemo.adapters.MernisServiceAdapter;
import reCapDemo.concretes.NeroCustomerManager;
import reCapDemo.concretes.StarbucksCustomerManager;
import reCapDemo.entities.Customer;

public class Program {
	public static void main(String[] args) {
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer("Ebubekir", "Yazýcý", 1999, "11111111111"));
	}
}