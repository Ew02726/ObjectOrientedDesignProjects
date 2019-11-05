
public class simulator {

	public static void main(String[] args) {
		PlayStationGames psg = new PlayStationGames();
		XboxGames xg = new XboxGames();
		
		gamer user = new gamer(psg, xg);
		
		user.printShelf();
	}
}
