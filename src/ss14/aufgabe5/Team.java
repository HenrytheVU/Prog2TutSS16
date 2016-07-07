package ss14.aufgabe5;

import java.util.ArrayList;
import java.util.List;

import ss14.aufgabe4.Player;

// Aufagbe 5:   3+3+4+4+5+5+6 = 30 Punkte
public class Team extends AbstractTeam {

	List<Player> members;

	// Aufgabe a) 3 Punkte
	public Team() {
		members = new ArrayList<Player>();
	}

	// b) 3 Punkte
	@Override
	Player[] getPlayers() {
		return (Player[]) members.toArray();
	}

	// c) 4 Punkte
	@Override
	Player playerByName(String name) {
		for (Player p : members) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	// d) 4 Punkte
	@Override
	boolean playerInTeam(String name) {
		// null != null => false
		// Player != null => true
		return playerByName(name) != null;
	}

	// e) 5 Punkte
	@Override
	void addPlayerToTeam(String name) throws IllegalArgumentException {
		if (!playerInTeam(name)) {
			members.add(new Player(name));
		} else {
			throw new IllegalArgumentException("Spieler bereits vorhanden");
		}
	}

	// f) 5 Punkte
	@Override
	Player removePlayerFromTeam(String name) throws IllegalArgumentException {
		if (playerInTeam(name)) {
			Player p = playerByName(name);
			members.remove(p);
			return p;
		} else {
			throw new IllegalArgumentException("Spieler nicht im Team");
		}
	}

	// g) 6 Punkte
	void wechsleSpieler(String nameOfReplacedPlayer, String nameOfNewPlayer) throws IllegalArgumentException {
		if (!playerInTeam(nameOfNewPlayer)) {
			if (playerInTeam(nameOfReplacedPlayer)) {
				// Alter Spieler vorhanden, Neuer Spieler noch nicht im Team
				// also tauschen
				removePlayerFromTeam(nameOfReplacedPlayer);
				addPlayerToTeam(nameOfNewPlayer);
				// Diese Methoden werden nie eine Exception werfen => try/catch ist überflüssig
			} else {
				// Neuer ist nicht da, aber der alte auch nicht
				throw new IllegalArgumentException("Auszuwechselnder Spieler ist nicht im Team");
			}
		} else

		{
			// Neuer Spieler ist schon im Team
			throw new IllegalArgumentException("Einzuwechselnder SPieler ist bereits im Team");
		}

	}

	// g) 6 Punkte
	@Override
	void substitutePlayer(String nameOfReplacedPlayer, String nameOfNewPlayer) throws IllegalArgumentException {
		// Vorgesehene Lösung
		try {
			removePlayerFromTeam(nameOfReplacedPlayer);
		} catch (IllegalArgumentException e) {
			// Spieler konnte nicht ausgewechselt werden, da nicht vorhanden
			throw new IllegalArgumentException("Auszuwechselnder Spieler ist nicht im Team");
		}

		try {
			addPlayerToTeam(nameOfNewPlayer);
		} catch (IllegalArgumentException e) {
			// Neuer spieler kann nicht eingewechselt werden, da schon
			// vorhanden!
			addPlayerToTeam(nameOfReplacedPlayer);
			throw new IllegalArgumentException("Einzuwechselnder SPieler ist bereits im Team");
		}

	}

}
