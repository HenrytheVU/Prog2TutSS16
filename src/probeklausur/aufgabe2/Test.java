package probeklausur.aufgabe2;

public class Test {
	
	public static void main(String[] args) {
		Konfigurationsleser leser = new Konfigurationsleser("data/faxconfig.txt");
		
		System.out.println(leser.dateiLeser());
	}

}
