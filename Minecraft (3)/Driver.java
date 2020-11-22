import java.sql.BatchUpdateException;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Block testBlock = new Block("copper", new Location(0, 0, 0), 5);
		System.out.println(testBlock);
		
		// Character textCharacter = new Character
		// good, just checking, but since Character is abstract, can't create an instance
		
		Villain testVillain = new Villain("Creeper", new Location(0, 1, 0), false, "axe", 10);
		System.out.println(testVillain);

		
		Hero testHero = new Hero("Bowen", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 5, 100) ;
		System.out.println(testHero);

		
		ArrayList<Character> BattleRoyale = new ArrayList<Character>();
		//BattleRoyale.add(testBlock); won't work!! (Thankfully)
		BattleRoyale.add(testVillain);
		BattleRoyale.add(testHero);
		System.out.println("Printing the mother of all battles");
		System.out.println(BattleRoyale);
		
		
	//	ArrayList<? extends Character> tester;
		boolean tf = GameMechanics.BattleTester(BattleRoyale);
		System.out.println("BATTLE TESTER TESTS without blocks");
		System.out.println(tf);

		ArrayList<Block> BattleRoyale2 = new ArrayList<Block>();
		BattleRoyale2.add(testBlock);
	/*	boolean tf2 = GameMechanics.BattleTester(BattleRoyale2);
		System.out.println("BATTLE TESTER TESTS with blocks");
		System.out.println(tf2);*/

		GameMechanics.basicWinChances(testVillain, testHero);
		GameMechanics.advancedWinChances(testHero, testVillain);
	}

}
