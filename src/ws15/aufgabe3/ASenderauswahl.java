package ws15.aufgabe3;

import java.util.List;

public abstract class ASenderauswahl {

	protected List<Sender> senderListe;
	protected Sender aktuellerSender;

	public ASenderauswahl() {
		super();
	}

	public abstract Sender wechselZuSenderMitNamen(String name);

	public abstract Sender wechselZuSenderMitNummer(int kanalNr);
	
	public Sender nextSender() {
		return wechselZuSenderMitNummer(aktuellerSender.getKanalNr() + 1);
	}
	
	@Override
	public abstract String toString();

}
