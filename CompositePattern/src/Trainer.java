
public class Trainer {

	public static void main(String[] args) {
		
		PokemonAttack p1 = new PokemonAttack("WaterGun", "water");
		PokemonAttack p2 = new PokemonAttack("FireBall", "fire");
		
		Trainer train = new Trainer();
		
		ShowAttack sa = new ShowAttack();
		sa.addPokemon(p1);
		sa.addPokemon(p2);
		
		ShowAttack direct = new ShowAttack();
		direct.addPokemon(sa);
		direct.showAttackDetails();
	}
}
