package streams.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestReadPersonFromFile {

	public static void main(String[] args) {

		FileInputStream fis;
		ObjectInputStream ois;

		try {
			fis = new FileInputStream("data/person.obj");
			ois = new ObjectInputStream(fis);

			Person p = (Person) ois.readObject();
			p.setVorname("Steve");
			System.out.println("Person: " + p.getNachname() + " " + p.getVorname() + " " + p.getSteuerID());
			ois.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
