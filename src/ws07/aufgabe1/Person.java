package ws07.aufgabe1;

public class Person implements Versteuerbar, Cloneable {

	private String name;
	private int alter;
	private boolean verheiratet;
	private float jahreseinkommen;

	public Person(String name, int alter, boolean verheiratet, float jahreseinkommen) {
		this.name = name;
		this.alter = alter;
		this.verheiratet = verheiratet;
		this.jahreseinkommen = jahreseinkommen;
	}

	@Override
	public float calcSteuerschuld() {
		return 0.3f * jahreseinkommen;
	}

	@Override
	public float calcSteuermaessigung() {
		if (verheiratet && alter > 60) {
			return 0.35f * calcSteuerschuld();
		} else if (verheiratet) {
			return 0.25f * calcSteuerschuld();
		} else if (alter > 60) {
			return 0.1f * calcSteuerschuld();
		}
		return 0;
	}

	public String toString() {
		return "Name: " + name + ", Alter: " + alter + ", Verheiratet: " + verheiratet + ", Jahreseinkommen: "
				+ jahreseinkommen + ", Steuerermäßigung: " + calcSteuermaessigung();
	}

	// Crtl + Shift + F

	public static void main(String[] args) {
		Person p = new Person("Henry", 27, false, 1000000);
		System.out.println(p);
	}

}
