import java.util.ArrayList;

public class ShowAttack extends Pokemon{
	private ArrayList<Pokemon> poke = new ArrayList<Pokemon>();
	public void showAttackDetails() {
		for(Pokemon p :poke) {
			p.showAttackDetails();
		}
	}
	public void addPokemon(Pokemon p) {
		poke.add(p);
	}
	
	public void removePokemon(Pokemon p) {
		poke.remove(p);
	}

}
