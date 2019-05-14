package classPractice;

public abstract class PokeCard {

	protected int hitPoints;
	protected int attackPoints;
	protected int pointsRemaining;
	private String pokeName;

	public PokeCard(String name, int hp, int ap) {
		pokeName = name;
		hitPoints = hp;
		attackPoints = ap;
		// at construct time pointsRemaining is hp
		pointsRemaining = hp;
		//System.out.print("\nPoken V1 Constructor");
	}

	public int getPointsRemaining() {
		return pointsRemaining;
	}

	public abstract void defend(int inHP);

	public abstract int attack();

	public String getName() {
		return pokeName;
	}

}
