package classPractice;

public class PokemonV2 extends PokeCard {
	double dodge;
	public PokemonV2(String name, int hp, int ap, double dodge) {
		super(name, hp, ap);
		this.dodge = dodge;
	}
	public void defend ( int inHP ){
		double randChance = Math.random()*1;
		//System.out.printf("\n RandChance=%s dodge=%s", randChance, dodge);
		if (  dodge >= randChance ) {	
			System.out.print("\n----Attack Dodged");
			inHP = 0;
		} else {
			System.out.print("\n----Attack Absorbed");
			// note pointsRemaining is not 'known' to V2 unless
			//    it is marked as protected
			pointsRemaining -= inHP;
		}
		
	}
	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return attackPoints;
	}

}
