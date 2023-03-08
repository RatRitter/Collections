import java.util.ArrayList;

public class Ratings {
ArrayList<Record> array = new ArrayList<>();

public ArrayList<Record> getArray(){
	return array;
}
public int getRating(int iUser,int iGame) {
	int rez = 0;
	Record rec;
	for(int i = 0;i < array.size();i++) {
		rec = array.get(i);
		if(rec.user == iUser && rec.game == iGame) {
			rez = rec.rating;
		}
	}
	return rez;
}
}