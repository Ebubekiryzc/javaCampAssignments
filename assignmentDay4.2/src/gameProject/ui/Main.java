package gameProject.ui;

import gameProject.abstracts.BaseCampaignManager;
import gameProject.abstracts.BaseCustomerManager;
import gameProject.abstracts.BaseGameManager;
import gameProject.abstracts.BaseSaleManager;
import gameProject.concretes.TemporaryCampaignManager;
import gameProject.concretes.ParkourGameManager;
import gameProject.concretes.RPGGameManager;
import gameProject.concretes.GamerManager;
import gameProject.concretes.CustomerCheckManager;
import gameProject.concretes.PaperSaleManager;
import gameProject.concretes.UserManager;
import gameProject.entities.Campaign;
import gameProject.entities.Customer;
import gameProject.entities.Game;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new GamerManager(new CustomerCheckManager());
		Customer customer1 = new Customer(1999, "12312312311", "Ebubekir", "YAZICI");
		Customer customer2 = new Customer(1998, "154", "Salih", "DEÐÝRMENCÝ");
		customerManager.save(customer1);
		customerManager.save(customer2);
		customerManager = new UserManager();
		customerManager.save(customer2);

		BaseGameManager gameManager = new RPGGameManager();
		Game witcher = new Game("The Witcher", "RPG/Action", "Game of the Year", 2015, 59.99);
		gameManager.save(witcher);
		gameManager = new ParkourGameManager();
		Game dyingLight = new Game("Dying Light", "Parkour/Action", "Best Survival Horror Game", 2014, 59.99);
		gameManager.save(dyingLight);

		BaseCampaignManager campaignManager = new TemporaryCampaignManager();
		Campaign campaign = new Campaign("Yaz Ýndirimleri", 50);
		campaignManager.save(campaign);

		BaseSaleManager saleManager = new PaperSaleManager();
		saleManager.sellGame(customer1, dyingLight, campaign);
		saleManager.sellGame(customer2, witcher);
	}
}
