package exercise08;

import java.io.IOException;
import java.io.OutputStream;

public class EncryptOutputStream extends OutputStream  {
	
	private int encryptionKey;
	private OutputStream os;
	
	
	public EncryptOutputStream(OutputStream os, int key) throws IllegalArgumentException {
		
		if( key < 0 || key > 255){
			throw new IllegalArgumentException("Wrong encryption Key: " + key);
		}
		
		encryptionKey = key;
		this.os = os;
	}

	@Override
	public void write(int oneByte) throws IOException {
		int encrypted = oneByte ^ encryptionKey;
		os.write(encrypted);
	}
	
	public void flush() throws IOException {
		os.flush();
	}
	
	
	public void close() throws IOException{
		os.close();
	}
	
	
	

}
