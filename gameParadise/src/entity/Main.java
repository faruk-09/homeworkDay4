package entity;

import java.util.Date;

import concrete.*;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager();
        GameManager gameManager = new GameManager();
        GameSellManager gameSellManager = new GameSellManager();
        CampaignManager campaignManager = new CampaignManager();
        
        
        Gamer gamer1 = new Gamer( 1 , "Faruk ", " Aydýn" , new Date (2000,1,12) , "11111111111" , "faruk_aydin_09@hotmail.com");
        
        gamerManager.gameAdd(gamer1);
        gamerManager.gameDelete(gamer1);
        gamerManager.gameUpdate(gamer1, "Serdar", "Aydemir", new Date (1999,1,1 ), "222222222222", "serdar@hotmail.com");

        
        System.out.println("------------------------------------");
        
        Game game1 = new Game(1 ,"PUBG", 29.99);
        gameManager.gameAdd(game1);
        gameManager.gameDelete(game1);
        gameManager.gameUpdate(game1, 2, "PUBG Lite ", 14.99 );
        
        System.out.println("------------------------------------");
        
        GameSell gamesell = new GameSell( 50, 10, 0);
       gameSellManager.gameSell(gamer1, game1);
       gameSellManager.gameSell(gamer1, null, game1, gamesell);
       
       System.out.println("------------------------------------");
       
       Campaign campaign1 = new Campaign (1, "Bu fiyata yok :)");
       campaignManager.campaignAdd(campaign1);
       campaignManager.campaigndelete(campaign1);
       campaignManager.campaign(campaign1, 2, "Büyük fýrsat", 0);
	}

}
