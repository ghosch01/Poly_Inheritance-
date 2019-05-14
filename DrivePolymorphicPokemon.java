package polymorph;

import java.util.ArrayList;
import java.util.Random;

import classPractice.PokeCard;
import classPractice.PokemonV1;
import classPractice.PokemonV2;
import classPractice.PokemonV3;

public class DrivePolymorphicPokemon {
	public static void main(String[] args) {

		ArrayList<PokemonV1> cardDeck = getCardDeck_V1();
		ArrayList<PokemonV2> cardDeck2 = getCardDeck_V2();
		ArrayList<PokemonV3> cardDeck3 = getCardDeck_V3();
		// ToDo: Create a polymorphic array of pokemon V1 and V2
		// gameDeck -> polymorphic arraylist of V1 V2 pokemon

		// ToDo ... add a couple of cards to GameDeck

		ArrayList<PokeCard> gameDeck = new ArrayList<PokeCard>();
		gameDeck.add(cardDeck.get(random()));
		gameDeck.add(cardDeck2.get(random()));
		gameDeck.add(cardDeck3.get(random()));

		PokeCard c1 = gameDeck.get(1);
		PokeCard c2 = gameDeck.get(2);

		System.out.printf("-----------------Pokemon Battle-----------------\n\n\n%s Attacks!!", c2.getName());
		// The game begins
//
//		if (c1.getPointsRemaining() > 0) {
//			winner = c1.getName();
//		} else {
//			winner = c2.getName();
//
//		}
		// This statement determines who is declared winner and loser

		String winner = null;
		int c2A = c2.attack();
		int c1A = c1.attack();
		boolean gameNotOver = true;
		while (gameNotOver) {
			c1.defend(c2A);
			System.out.printf("\n\n%s(V3) attacks %s(V2) with %s power.", c2.getName(), c1.getName(), c2A);
			System.out.printf("\n%s(V2) Health Remaining --> %s%%\n\n", c1.getName(), c1.getPointsRemaining());
			if (c1.getPointsRemaining() <= 0) {
				winner = c2.getName();
				System.out.printf("\nEnd Game! %s Wins", winner);
				gameNotOver = false;
				System.exit(1);
			} else {
				c2.defend(c1A);
				System.out.printf("\n\n%s(V2) attacks %s(V3) with %s power.", c1.getName(), c2.getName(), c2A);
				System.out.printf("\n%s(V3) Health Remaining --> %s%%\n\n", c2.getName(), c2.getPointsRemaining());
			}
			if (c2.getPointsRemaining() <= 0) {
				winner = c1.getName();
				System.out.printf("\nEnd Game! %s Wins", winner);
				gameNotOver = false;
				System.exit(1);
			}
		}
	}

	public static int random() {
		Random pick = new Random();
		int p = pick.nextInt(6);
		return p;

	}

	private static ArrayList<PokemonV1> getCardDeck_V1() {
		ArrayList<PokemonV1> cardDeck = new ArrayList<PokemonV1>();
		cardDeck.add(new PokemonV1("Bulbasaur", 45, 49));
		cardDeck.add(new PokemonV1("Ivysaur", 60, 62));
		cardDeck.add(new PokemonV1("Venusaur", 80, 82));
		cardDeck.add(new PokemonV1("Charmander", 139, 52));
		cardDeck.add(new PokemonV1("Squirtle", 44, 48));
		cardDeck.add(new PokemonV1("Wartortle", 59, 63));
		return cardDeck;
	}

	private static ArrayList<PokemonV2> getCardDeck_V2() {
		ArrayList<PokemonV2> cardDeck = new ArrayList<PokemonV2>();
		cardDeck.add(new PokemonV2("Bulbasaur", 100, 49, .50));
		cardDeck.add(new PokemonV2("Ivysaur", 100, 62, .50));
		cardDeck.add(new PokemonV2("Venusaur", 100, 82, .50));
		cardDeck.add(new PokemonV2("Charmander", 100, 52, .90));
		cardDeck.add(new PokemonV2("Squirtle", 100, 48, .50));
		cardDeck.add(new PokemonV2("Wartortle", 100, 63, .50));
		return cardDeck;
	}

	private static ArrayList<PokemonV3> getCardDeck_V3() {
		ArrayList<PokemonV3> cardDeck = new ArrayList<PokemonV3>();
		cardDeck.add(new PokemonV3("Bulbasaur", 100, 49, .50, .60));
		cardDeck.add(new PokemonV3("Ivysaur", 100, 62, .50, .90));
		cardDeck.add(new PokemonV3("Venusaur", 100, 82, .50, .60));
		cardDeck.add(new PokemonV3("Charmander", 100, 52, .90, .9));
		cardDeck.add(new PokemonV3("Squirtle", 100, 48, .50, .9));
		cardDeck.add(new PokemonV3("Wartortle", 100, 63, .50, .9));
		return cardDeck;
	}
}