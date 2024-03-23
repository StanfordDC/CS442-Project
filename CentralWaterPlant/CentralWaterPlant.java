package CentralWaterPlant;

import java.math.BigInteger;
import java.util.Scanner;

import CentralAuthority.PKG;

public class CentralWaterPlant {
	
public static void main(String args[]){
	
		String ID;
		
		Scanner p = new Scanner (System.in);
		
		System.out.println("Enter your ID:");
		ID = p.next();
			
		
		System.out.println("Searching for messages");
		
		
		PKG pkg = new PKG();
		BigInteger Private_key =pkg.get_private_key(ID);
		BigInteger n = pkg.getn();
		
		
//		System.out.println("\nMy Private Key is :- " +   Private_key );
		
		
		Decrypt decryptMessage = new Decrypt(ID,n,Private_key);
		
		System.out.println("\n --------------------Decrypted message is -------------------------\n");
		
		decryptMessage.decrypt();
		
	}
}
