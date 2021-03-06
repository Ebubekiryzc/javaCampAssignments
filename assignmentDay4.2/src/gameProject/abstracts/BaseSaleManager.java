package gameProject.abstracts;

import gameProject.entities.Campaign;
import gameProject.entities.Customer;
import gameProject.entities.Game;

public abstract class BaseSaleManager implements SaleService{

	@Override
	public void sellGame(Customer customer, Game game) {
		System.out.println(game.getName()+ " oyunu "+customer.getFirstName()+" "+customer.getLastName()+" kullanıcısına "+game.getPrice()+" fiyatına satıldı!");		
	}

	@Override
	public void sellGame(Customer customer, Game game, Campaign campaign) {

		System.out.println(game.getName()+ " oyunu "+customer.getFirstName()+" "+customer.getLastName()+" kullanıcısına "+game.getPrice()*campaign.getDiscountRate()/100+" fiyatına satıldı!");
	}

}
