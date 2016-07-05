package ws15.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class SenderAuswahl extends ASenderauswahl {

	protected List<Sender> senderListe;
	protected Sender aktuellerSender;

	public SenderAuswahl(String[] kanaele) {
		senderListe = new ArrayList<Sender>();
		for (int i = 0; i < kanaele.length; i++) {
			if(kanaele[i] == null || "".equals(kanaele[i])) {
				senderListe.add(new Sender("", i + 1 ));
			} else {
				senderListe.add(new Sender(kanaele[i], i + 1));
			}
		}
		aktuellerSender = wechselZuSenderMitNummer(1);
	}

	// d
	@Override
	public Sender wechselZuSenderMitNamen(String name) {
		for(Sender s : senderListe) {
			if(name.equals(s.getName())) {
				aktuellerSender = s;
			}
		}
		return aktuellerSender;
	}

	// c
	@Override
	public Sender wechselZuSenderMitNummer(int kanalNr) {
		if(kanalNr < senderListe.size()) {
			aktuellerSender = senderListe.get(kanalNr - 1);
		}
		return aktuellerSender;
	}

	@Override
	public String toString() {
		return "Aktueller Sender: "+ aktuellerSender + " Senderliste: " + senderListe;
	}
	
	public static void main(String[] args) {
		String[] kanaele = {"ZDF", "PRO7", "Erste"};

		SenderAuswahl sa = new SenderAuswahl(kanaele);
		
		System.out.println(sa);
	}
	
}
