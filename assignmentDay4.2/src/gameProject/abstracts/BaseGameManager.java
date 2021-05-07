package gameProject.abstracts;

import gameProject.entities.Game;

public abstract class BaseGameManager implements GameService {

	@Override
	public void save(Game game) {
		System.out.println(game.getName()+" adl� oyun veri taban�na eklendi! Art�k sat�labilir durumda!");		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" adl� oyun g�ncellendi!");		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getName()+" adl� oyun veri taban�ndan kald�r�ld�!");
	}
	
}
