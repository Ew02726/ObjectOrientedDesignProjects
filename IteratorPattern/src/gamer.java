import java.util.Iterator;

public class gamer {

	PlayStationGames playStationgame;
	XboxGames xboxgames;
	
	public gamer(PlayStationGames playStationGames, XboxGames xboxGames) {
		this.playStationgame = playStationGames;
		this.xboxgames = xboxGames;
	}
	
	public void printShelf() {
		Iterator xboxIterator = xboxgames.createIterator();
		Iterator playIterator = playStationgame.createIterator();
		System.out.println("Shelf\n----\nXbox");
		printShelf(xboxIterator);
		System.out.println("\nPlayStation");
		printShelf(playIterator);
		
	}
	
	private void printShelf(Iterator iterator) {
		while(iterator.hasNext()) {
			Games games = (Games)iterator.next();
			System.out.println(games.getName() + ", ");
			System.out.println(games.getPrice() + ", ");
			System.out.println(games.getDescription() + ", ");
			System.out.println(games.isrRated() + " ");
			
		}
	}
}
