package abstractt;

import entity.Game;

public interface IGameService {
	void gameAdd(Game game);
	void gameDelete(Game game);
	void gameUpdate(Game game , int gameId , String gameName, double gamePrice );
}
