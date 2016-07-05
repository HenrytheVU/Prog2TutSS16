package ws14.aufgabe3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamDoppler extends OutputStream {

	OutputStream o1;
	OutputStream o2;

	// a)
	public OutputStreamDoppler(OutputStream o1, OutputStream o2) {
		super(); //
		this.o1 = o1;
		this.o2 = o2;
	}

	// b) 6 Punkte
	public void close() throws IOException {
		// Bekommen wir bei Schlieﬂen des ersten Streams einen Fehler, bleibt
		// der zweite Offen!
		o1.close();
		o2.close();

		// Lˆsung, bei der versucht wird den zweiten Stream immer auch mit zu
		// schlieﬂen
		// try {
		// o1.close();
		// } catch(Exception e){
		//
		// } finally{
		// o2.close();
		// }

	}

	// c) 10 Punkte
	public void write(int b) throws IOException {
		boolean error = false;

		try {
			o1.write(b);
		} catch (IOException e) {
			error = true;
		}

		try {
			o2.write(b);
		} catch (IOException e) {
			error = true;
		}

		if (error) {
			throw new IOException();
		}
	}
	
	// d) 10 Punkte
	public static void main(String[] args) {

		try {
			FileOutputStream fos1 = new FileOutputStream("data/file1");
			FileOutputStream fos2 = new FileOutputStream("data/file2");

			OutputStreamDoppler osd = new OutputStreamDoppler(fos1, fos2);
			
			
			
			OutputStreamWriter osw = new OutputStreamWriter(osd);

			osw.write("Hello World \n");
			osw.write("Hallo \n");
			
			

			//osd.close(); // nicht notwendig, das osw automatisch seinen
							// Outputstream (osd) schlieﬂt
			osw.close();

		} catch (IOException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
