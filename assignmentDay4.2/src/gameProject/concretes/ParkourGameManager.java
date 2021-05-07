package gameProject.concretes;

import gameProject.abstracts.BaseGameManager;
import gameProject.entities.Game;

public class ParkourGameManager extends BaseGameManager{

	@Override
	public void save(Game game) {
		System.out.println(game.getName()+" adl� oyun veri taban�na eklendi! Art�k Parkour t�r�nde sat�labilir durumda!");
	}

}
