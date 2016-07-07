package ss14.aufgabe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPlayer {

	public static void main(String[] args) {
		Player[] players = new Player[] { new Player("Podolski"), new Player("Lahm"), new Player("Mertesacker") };
		players[0].score(); players[0].score(); players[0].score();
		players[1].score(); players[1].score();
		
		ArrayList<Player> liste2 = new ArrayList<Player>();
		liste2.sort(new ComparatorName());
		Collections.sort(liste2);
		//Collections.sort(arg0, arg1);
		
		for (Player p : players) {
			System.out.print(p + "; ");
		}
		System.out.println();

		
		Arrays.sort(players, new ComparatorName());

		for (Player p : players) {
			System.out.print(p.getName() + "; ");
		}
		System.out.println();
		
		Arrays.sort(players, new ComparatorGoal());
		for (Player p : players) {
			System.out.print(p.getName() + "; ");
		}
		System.out.println();
		
		// Sortierung nach Geburtstdatum mit Interface Comparable und CompareTo() 
		Arrays.sort(players);
		for (Player p : players) {
			System.out.print(p.getName() + "; ");
		}
		
	}

}
