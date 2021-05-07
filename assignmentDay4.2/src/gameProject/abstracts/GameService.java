package gameProject.abstracts;

import gameProject.entities.Game;

public interface GameService {
	void save(Game game);

	void update(Game game);

	void remove(Game game);
}
