
public class Record implements Comparable<Record>{
int game;
int user;
int rating;
Record(int iGame,int iUser,int iRating){
	this.game = iGame;
	this.user = iUser;
	this.rating = iRating;
}
public int compareTo(Record obj) {
	return (this.rating-obj.rating);
}
}
