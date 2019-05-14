package classPractice;

public class PokemonV3 extends PokemonV2 {
	double criticalHit;
	double dodge;

	public PokemonV3(String name, int hp, int ap, double dodge, double critical) {
		super(name, hp, ap, dodge);
		criticalHit = critical;
		// Override Attack, with a random chance of critical hit

	}

	public int attack() {
		int criticalAttack = 0;
		double randChance = Math.random() * 1;
		//System.out.printf("\n randomChance=%s criticalChance=%s", randChance, criticalHit);
		if (criticalHit < randChance) {
			criticalAttack = attackPoints;
			System.out.print("\n----Normal Attack----");
		} else {
			criticalAttack = attackPoints * 2;
			System.out.print("\n----Critical Attack----");
		}
		return criticalAttack;
	}

}
