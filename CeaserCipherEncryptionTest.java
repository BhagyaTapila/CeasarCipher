package CeaserCipher;

import static org.junit.Assert.*;


import org.junit.Test;

public class CeaserCipherEncryptionTest {

	//For Encryption method
	@Test
	public void test1() {  
		assertEquals("Ekdjbd!", CeaserCipherEncryption.encrypt("Bhagya!", 3));
	}
	//For Decryption method
	@Test
	public void test2() { 
		assertEquals("Bhagya!", CeaserCipherEncryption.decrypt("Ekdjbd!", 3));
		
	}


}
