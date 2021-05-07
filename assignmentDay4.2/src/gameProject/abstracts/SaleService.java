package gameProject.abstracts;

import gameProject.entities.Campaign;
import gameProject.entities.Customer;
import gameProject.entities.Game;

public interface SaleService {
	void sellGame(Customer customer, Game game);

	void sellGame(Customer customer, Game game, Campaign campaign);
}
