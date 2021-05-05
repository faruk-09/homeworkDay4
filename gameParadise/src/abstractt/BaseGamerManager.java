package abstractt;

import java.util.Date;

import entity.Gamer;

public abstract class BaseGamerManager implements IGamerService {

	@Override
	public void gameAdd(Gamer gamer) {
		System.out.println("Oyuncu " +gamer.getFirstName()+ " eklendi  " );
		
	}

	@Override
	public void gameDelete(Gamer gamer) {
		System.out.println("Oyuncu " +gamer.getFirstName()+ " silindi " );
		
	}

	
	@Override
	public void gameUpdate(Gamer gamer, String firstName, String lastName, Date birtday,
			String nationalId, String email) {
		
		gamer.setFirstName(firstName);
		gamer.setLastName(lastName);
		gamer.setBirtday(birtday);
		gamer.setNationalId(nationalId);
		gamer.setEmail(email);
		System.out.println("Güncelleme Baþarýlý! " );
		
		
		
		
	}

}
