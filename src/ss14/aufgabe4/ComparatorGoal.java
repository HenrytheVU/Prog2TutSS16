package ss14.aufgabe4;

import java.util.Comparator;

public class ComparatorGoal implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		return o1.getGoals()-o2.getGoals();
	}

}
