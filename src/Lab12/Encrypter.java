package Lab12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Encrypter {

    private int shift;
    private String encrypted;

    /**
     * Default Constructor
     */
    public Encrypter() {
        this.shift = 1;
        this.encrypted = "";
    }

    /**
     * Non-default Constructor
     * @param s - custom shift amount
     */
    public Encrypter(int s) {
        this.shift = s;
        this.encrypted = "";
    }

    /**
     * Encrypts the content of a file and writes the result to another file.
     *
     * @param inputFilePath      the path to the file containing the text to be encrypted
     * @param encryptedFilePath the path to the file where the encrypted text will be written
     * @throws Exception if an error occurs while reading or writing the files
     */
    public void encrypt(String inputFilePath, String encryptedFilePath) throws Exception {
        //TODO: Call the read method, encrypt the file contents, and then write to new file
    	
    	try (PrintWriter output = new PrintWriter(encryptedFilePath)){
			
		try(Scanner fileScanner = new Scanner(Paths.get(inputFilePath))){
    		while(fileScanner.hasNextLine()) {
    			
    			String line = fileScanner.nextLine();
    			char[] arr = line.toCharArray();
    			for(int i=0; i<arr.length;i++) {
    				System.out.println(arr[i]);
    				if ((arr[i]<97+shift && arr[i]>97)|| arr[i]>122) {
    					int newarraydecimalval = 122 - ((shift-(arr[i]-97))-1);
    					int newshift1=newarraydecimalval-arr[i];
    					arr[i]+= newshift1;
//    					int Shiftremaining = arr[i]-'a';
//    					int z =('z'-shift - Shiftremaining -1);
////    					arr[i]+=32;
//    					shift = z-arr[i];
//    					arr[i]+=shift; 
    					
//    					System.out.println(arr[2]-1);
//    				
    					
//    					arr[i]+=z;
    				}
    				else if (arr[i]=='a' || arr[i]=='A') {
    					arr[i]+=22;
    				}
    				else if (arr[i]>=97+shift && arr[i]<=122) {
    					arr[i]-= shift;
    				}
    				else if ((arr[i]<65+shift && arr[i]>65) || (arr[i]>90 && arr[i]<97)) {
    					int V = 90 - (shift-(arr[i]-65)-1);
    					int newshift2 = V-arr[i];
    					arr[i]+=newshift2;
    				
    					
    				}
    				else if (arr[i]>=65+shift && arr[i]<=90) {
    					arr[i]-= shift;
    				}
    				
//    				System.out.println(arr[i]-=arr[i]);
//    				System.out.println(shift);
    				
    				
    				
//    			    char a = inputFilePath.charAt(i);
//    			    a +=3;
    			}
    			String str = new String(arr);
//    			System.out.println(str);
    			output.println(str);
//    			System.out.println(line);
    		}
    	}
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	}
    	catch (Exception e) {
    		System.out.println("Error: "+ e.toString());
    	}
    	}
    

    /**
     * Decrypts the content of an encrypted file and writes the result to another file.
     *
     * @param messageFilePath    the path to the file containing the encrypted text
     * @param decryptedFilePath the path to the file where the decrypted text will be written
     * @throws Exception if an error occurs while reading or writing the files
     */
    public void decrypt(String messageFilePath, String decryptedFilePath) throws Exception {
    		shift = + shift;
    		encrypt( messageFilePath,  decryptedFilePath);
        //TODO: Call the read method, decrypt the file contents, and then write to new file
    }

    /**
     * Reads the content of a file and returns it as a string.
     *
     * @param filePath the path to the file to be read
     * @return the content of the file as a string
     * @throws Exception if an error occurs while reading the file
     */
    private static String readFile(String filePath) throws Exception {
        String message = "";
        //TODO: Read file from filePath
        return message;
    }

    /**
     * Writes data to a file.
     *
     * @param data     the data to be written to the file
     * @param filePath the path to the file where the data will be written
     */
    private static void writeFile(String data, String filePath) {
        //TODO: Write to filePath
    	try (PrintWriter output = new PrintWriter(filePath)){
			output.println(data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    /**
     * Returns a string representation of the encrypted text.
     *
     * @return the encrypted text
     */
    @Override
    public String toString() {
        return encrypted;
    }
}
