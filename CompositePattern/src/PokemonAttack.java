
public class PokemonAttack extends Pokemon{

	private String attack;
	private String type;

	public PokemonAttack(String attack, String type) {
		this.attack = attack;
		this.type = type;
	}
	
	public void showAttackDetails() {
		System.out.println("Pokemon use " + attack + " which is a  " + type + " type.");
	}
}
