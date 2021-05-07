package gameProject.abstracts;

import gameProject.entities.Game;

public abstract class BaseGameManager implements GameService {

	@Override
	public void save(Game game) {
		System.out.println(game.getName()+" adlý oyun veri tabanýna eklendi! Artýk satýlabilir durumda!");		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" adlý oyun güncellendi!");		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getName()+" adlý oyun veri tabanýndan kaldýrýldý!");
	}
	
}
