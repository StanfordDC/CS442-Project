package CentralWaterPlant;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Decrypt {

	
	BigInteger n , private_key;
	String ID;

    File file = new File("C:\\Term 8 Classes\\CS442\\Identity-Based-Encryption\\ibe\\EncryptedMessage.txt");

	public Decrypt( String ID,BigInteger n , BigInteger private_Key){
		
		this.ID = ID;
		this.private_key = private_Key;
		this.n = n;
		
	}
	
	public String decrypt() {							// First Reading Message then crypting
		System.out.println(file.getAbsolutePath());
		byte [] message = new byte[0];
		int k;
		boolean flag = false;
		
		try {
			
			Scanner p = new Scanner(file);
			while(p.hasNext()){
				
					if(p.next().compareTo(ID) == 0){			// Message Found for this server
						
						k = p.nextInt();
						message  = new byte[k];
						
						for(int i=0;i<k;i++){
							
							message[i] = p.nextByte();
							
						}
						
						flag = true;
						System.out.println(new String(decryptMessage(message)) + "\n");
						
					}
					else{
						
						k = p.nextInt();
						
						for(int i=0;i<k;i++){
							
							p.nextByte();
							
						}
						
					}
					
			}
							
			p.close();
			if(flag)	return new String(decryptMessage(message)); 
			
		} 
		catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println(new String("There is no message for you !!!!!!!"));
		return new String("There is no message for you !!!!!!!");   // No Message Found for this server
		
        
    } 
	
	private static String bytesToString(byte[] encrypted) { 
		
        String test = ""; 
        
        for (byte b : encrypted) { 
            test += Byte.toString(b); 
        } 
        
        return test; 
        
    } 
	
	public byte[] decryptMessage(byte[] message) {			// Actual Message Decryption
		
        return (new BigInteger(message)).modPow(private_key, n).toByteArray(); 
        
    }
     
}
