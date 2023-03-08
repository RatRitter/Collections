import java.util.Collections;

public class Tables {
Games games = new Games();
Users users = new Users();
Ratings ratings = new Ratings();
public boolean addUser(String name) {
	return users.addUser(name);
}
public boolean addGame(String name) {
	return games.addGame(name);
}

public void WinInGame(int iUser,int iGame) {
	Record rec;
	int index = -1;
	for(int i = 0; i < ratings.array.size();i++) {
		rec = ratings.array.get(i);
		if(rec.game == iGame && rec.user == iUser) {
			index = i;
			
		}
		if(index == -1) {
			ratings.array.add(new Record(iGame,iUser,0));
				index = ratings.array.size() - 1;
			}
		int oldRating = ratings.array.get(index).rating;
		int newRating = oldRating + 1;
		ratings.array.set(index,new Record(iGame,iUser,newRating));
		}
	}

public int choiseUser() {
	return users.choiseUser();
}
public int choiseGame() {
	return games.choiseGame();
}
public void disGame() {
	games.GameList();
	
}
public int getRating(int iUser,int iGame) {
	return ratings.getRating(iUser, iGame);
}
public void disLiders(int iGame) {
	Ratings choiseT = new Ratings();
	Record rec;
	for(int i = 0; i < ratings.array.size();i++) {
		rec = ratings.array.get(i);
		if(rec.game == iGame) {
			choiseT.array.add(rec);
		}
	}
		Collections.sort(choiseT.array);
		Collections.reverse(choiseT.array);
		System.out.println("Rating: " + games.array.get(iGame));
		for(int i = 0; i < choiseT.array.size();i++) {
			if(i < choiseT.array.size()) {
				rec = ratings.array.get(i);
				System.out.println(users.array.get(rec.user));
				System.out.println(rec.rating);
			}
		}
	}
}

