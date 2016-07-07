package ss14.aufgabe5;

import java.util.List;

import ss14.aufgabe4.Player;

public abstract class AbstractTeam {
	List<Player> members; 
	 
	 // Teilaufgabe b: 
	 abstract Player[] getPlayers(); 
	  
	 // Teilaufgabe c: 
	 abstract Player playerByName(String name); 
	  
	 // Teilaufgabe d: 
	 abstract boolean playerInTeam(String name);  
	  
	 // Teilaufgabe e: 
	abstract void addPlayerToTeam(String name)  
	throws IllegalArgumentException;  
	  
	 // Teilaufgabe f: 
	abstract Player removePlayerFromTeam(String name)  
	throws IllegalArgumentException; 
	  
	 // Teilaufgabe g: 
	abstract void substitutePlayer(String nameOfReplacedPlayer,  
	String nameOfNewPlayer) throws IllegalArgumentException; 
}
