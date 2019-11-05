import java.util.ArrayList;
import java.util.Iterator;

public class PlayStationGames implements Game{

	ArrayList<Games> playStationGames;
	
	public PlayStationGames() {
		playStationGames = new ArrayList<Games>();
		
		addItem("Halo", "First Person Shooter", true, 30.99);
		addItem("Mario", "Nitendo", false, 40.50);
		addItem("Wizard101", "Card Game", false, 15.99);
		addItem("Doom", "First Person Shooter", true, 60.99);
	}
	
	public void addItem(String name, String description, boolean rRated, double price) {
		Games game = new Games(name, description, rRated, price);
		playStationGames.add(game);
			
	}

	public ArrayList<Games> getPlayStationGames() {
		return playStationGames;
	}

	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return playStationGames.iterator();
	}

	

	
}
