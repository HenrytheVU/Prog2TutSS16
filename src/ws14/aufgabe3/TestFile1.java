package ws14.aufgabe3;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFile1 {

	public static void main(String[] args) throws Exception{
		
		//FileInputStream fis = new FileInputStream("data/file1");
		
		//InputStreamReader isr = new InputStreamReader(fis);
		//isr.read
		
		
		
		FileReader fr = new FileReader("data/file1");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		while (line != null){
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();
		 
	}

}
