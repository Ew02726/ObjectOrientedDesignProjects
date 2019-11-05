import java.util.Iterator;

public class XboxGames implements Game{
	// max number of games on shelf
	static final int max = 4;
	int numOfGames = 0;

	//array of game objects
	Games[] games;

	public XboxGames() {
		games = new Games[max];
		addItem("Zombies", "First Person Shooter", true, 30.99);
		addItem("Fornite", "First Person Shooter", false, 0.0);
		addItem("Call of Duty", "First Person Shooter", true, 30.99);
		addItem("Pokemon", "Anime", false, 15.99);

	}
	
	public Iterator createrIterator() {
		return new GameIterator(games);
	}

	//parameters of a game
	public void addItem(String name, String description, boolean rRated, double price) {
		Games game = new Games(name, description, rRated, price);
		if(numOfGames >= max) {
			System.out.println("Game shelf full");
		}
		else {
			games[numOfGames] = game;
			numOfGames++;
		}
	}

	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new GameIterator(games);
	}
	

}
