package abstractt;

import entity.Campaign;
import entity.Game;
import entity.GameSell;
import entity.Gamer;

public interface IGameSellService {
	void gameSell(Gamer gamer , Game game);
	void gameSell(Gamer gamer, Campaign campaign, Game game, GameSell gameSell);
	
}
