package abstractt;

import java.util.Date;

import entity.Gamer;

public interface IGamerService {
	void gameAdd(Gamer gamer);
	void gameDelete(Gamer gamer);
	void gameUpdate(Gamer gamer , String firstName , String lastName, Date birtday, String nationalId, String email );
}
