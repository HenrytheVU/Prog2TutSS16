package exercise08;

import java.io.*;

// Mit Hilfe dieser Klassen sollen verschluesselte Dateien
// auf der Konsole ausgegeben werden. Dazu ist die Datei zu
// oeffnen, mit einem Decryptor-Decorator zu versehen und
// einzulesen. Jedes eingelesene und entschluesselte Zeichen
// soll unmittelbar auf der Konsole ausgegeben werden. 

public class FileDecryptor {

	// Diese Methode muss nach den Vorgaben implementiert werden.
	public static void decryptFile(String filename)
	{
		DecryptInputStream decryptIS;
		
		try {
			decryptIS = new DecryptInputStream(new FileInputStream(filename), 100);
			int b = decryptIS.read();
			
			while (b != -1){
				System.out.print((char)b); 
				
				b = decryptIS.read();
			}
			
			decryptIS.close();
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	// Diese main-Methode zeigt die Verwednung der zu 
	// implementierenden Methode. An der Ausgabe koennen Sie 
	// erkennen, ob Ihre Implementierung funktioniert.
	public static void main(String[] args)
	{
		decryptFile("src/exercise08/data.crypt");
	}
	
}
