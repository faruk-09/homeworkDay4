package abstractt;

import entity.Campaign;
import entity.Game;
import entity.GameSell;
import entity.Gamer;

public class BaseGameSellManager implements IGameSellService {

	@Override
	public void gameSell(Gamer gamer, Game game) {
		System.out.println(game.getGameName() + " oyununu sat�n ald�n�z");
		
	}


	@Override
	public void gameSell(Gamer gamer, Campaign campaign, Game game , GameSell gamesell ) {
		gamesell.getPrice();
		gamesell.getDiscountedPrice();
		System.out.println(game.getGameName() + "�ndirimli Fiyat� "+ gamesell.getDiscountedPrice());
		
	}




	




	
}
