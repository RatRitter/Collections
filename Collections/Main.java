import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Tables tables = new Tables();

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		tab();
		while(true) {
			System.out.println("Enter a user: ");
			System.out.println("1 - add ");
			System.out.println("2 - win ");
			System.out.println("3 - GameList ");
			System.out.println("4 - rating of user ");
			System.out.println("5 - 10 of liders");
			str = sc.nextLine();
			if("2".equals(str)) {
				int iUser = tables.choiseUser();
				int iGame = tables.choiseGame();
				//str = sc.nextLine();
				//boolean correct = tables.addUser(str);
				//if(correct)System.out.println("User added" + str);
				//else System.out.println("Error");
			}
			if("3".equals(str)) {
				tables.disGame();
		}
			if("4".equals(str)) {
				int iUser = tables.choiseUser();
				int iGame = tables.choiseGame();
				System.out.println("Rating " + tables.getRating(iUser, iGame));
	}
			if("5".equals(str)) {
				
				int iGame = tables.choiseGame();
				tables.disLiders(iGame);
	}
	}
	}
public static void tab() {
	String string;
	Random rand = new Random();
	for(int i = 0; i <= 20; i++) {
		string = "User " + Integer.toString(i);
		tables.addUser(string);
	}
	tables.addGame("Dead by Daylight");
	tables.addGame("Left 4 Dead");
	tables.addGame("Warhammer");
	tables.addGame("Don't Starve Together");
	tables.addGame("Quake");
	for(int i = 0; i <= 5; i++) {
		string = "User " + Integer.toString(i);
		tables.addUser(string);
	}
		for(int i = 0; i < 100;i++) {
			tables.WinInGame(rand.nextInt(19), i);
			rand.nextInt(4);
		}
		
		
}
}
