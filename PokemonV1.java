package classPractice;

public class PokemonV1 extends PokeCard {

	public PokemonV1(String name, int hp, int ap) {
		super(name, hp, ap);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void defend(int inHP) {
		pointsRemaining -= inHP;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return attackPoints;
	}

}
