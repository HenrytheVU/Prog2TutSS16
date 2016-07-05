package streams.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSavePersonToFile {


	public static void main(String[] args) {
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		Person p = new Person("Stefan","Hassel","12341325Efdkdlsg1243");
		System.out.println("Person: "+ p.getNachname() + p.getVorname()+ p.getSteuerID());
		
		try {
			fos = new FileOutputStream("data/person.obj");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			oos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
