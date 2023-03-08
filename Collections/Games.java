import java.util.ArrayList;
import java.util.Scanner;

public class Games {
ArrayList<String> array = new ArrayList<>();
Scanner sc = new Scanner(System.in);
public boolean addUser(String name) {
	for(int i = 0; i < this.array.size();i++) {
		
	
		if(this.array.get(i) == name)
			return false;
	}
	this.array.add(name);
	return true; 
}
public boolean addGame(String name) {
	for(int i = 0; i < array.size();i++) {
		
	
		if(array.get(i) == name)
			return false;
	}
	array.add(name);
	return true;
	
}
public void GameList() {

	for(int i = 0; i < array.size();i++) {
		System.out.println("\t " +1+" - " + array.get(i));
	}
}
	public int choiseGame() {
		System.out.println("Choise a game: ");
		GameList();
		return sc.nextInt();

}
}