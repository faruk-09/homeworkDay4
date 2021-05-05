package abstractt;

import entity.Game;

public abstract class BaseGameManager implements IGameService {

	@Override
	public void gameAdd(Game game) {
		System.out.println("Yeni oyunumuz " +game.getGameName()+ " sizlerle " +game.getGamePrice()+  " sahip olabilirsiniz! ");
		
	}

	@Override
	public void gameDelete(Game game) {
		System.out.println("Oyuna eriþim saðlanamýyor :( " +game.getGameName());
		
	}

	@Override
	public void gameUpdate(Game game, int gameId, String gameName, double gamePrice) {
		game.setGameId(gameId);
		game.setGameName(gameName);
		game.setGamePrice(gamePrice);
		
		System.out.println("Oyun güncellemesi gerçekleþtirildi. " +game.getGameName() +game.getGamePrice() + game.getGameId());
		
	}

}
