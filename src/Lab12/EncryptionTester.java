package Lab12;

public class EncryptionTester {
	
	public static void main(String[] args) throws Exception {
        String encryptedFilePath = "src/encrypted.txt";
        String decryptedFilePath = "src/decrypted.txt";
        String inputFilePath = "src/encryptMe.txt";
        String outputFilePath = "src/newEncrypted.txt";
        // creates newEncrypted.txt
		
        int shift = 4; // Says how much you would like to shift

        Encrypter enc = new Encrypter(shift);

		enc.encrypt(inputFilePath, outputFilePath);
		enc.decrypt(encryptedFilePath, decryptedFilePath);

	}


}
