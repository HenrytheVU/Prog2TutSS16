package exercise08;

import java.io.IOException;
import java.io.InputStream;

public class DecryptInputStream extends InputStream {
	
	InputStream inputStream;
	int decryptionKey;
	
	
	public DecryptInputStream(InputStream is, int key) throws IllegalArgumentException{
		
		if(key < 0 || key > 255){
			throw new IllegalArgumentException("Wrong Decryption key: " + key);
		}
		
		
		inputStream = is;
		decryptionKey = key;
	}
	
	

	@Override
	public int read() throws IOException {
		
		int encryptedByte = inputStream.read();
		int decrypted = encryptedByte ^ decryptionKey;
		return decrypted;
	}
	
	@Override
	public void close() throws IOException{
		inputStream.close();
	}

}
