package gameProject.concretes;

import gameProject.abstracts.BaseGameManager;
import gameProject.entities.Game;

public class ParkourGameManager extends BaseGameManager{

	@Override
	public void save(Game game) {
		System.out.println(game.getName()+" adlý oyun veri tabanýna eklendi! Artýk Parkour türünde satýlabilir durumda!");
	}

}
