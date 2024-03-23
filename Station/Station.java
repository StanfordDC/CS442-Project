package Station;

import java.math.BigInteger;

import java.util.Scanner;

import CentralAuthority.PKG;

public class Station {
	
	
	public static void main(String args[]){
		
		String message,ID,temp,ID1;
		
		Scanner p = new Scanner (System.in);
		
		System.out.println("Enter your name:");
		ID1 = p.next();
		
		System.out.println("\nEnter ID of receiver:");
		ID = p.next();
		
		temp = p.nextLine();
		
		
		System.out.println("\nEnter the Message:");
		temp = p.nextLine();
		
		message = ID1;
		message +=" has sent you a message:\n";
		message += temp;
		
		PKG pkg = new PKG();
		BigInteger Public_key = pkg.get_public_key(ID1);
		Public_key = pkg.get_public_key(ID);
		BigInteger n = pkg.getn();
		
		
		System.out.println("\npublic key of Server is : " + Public_key);
		
		
		
		System.out.println("\n--------------------Encrypted message is -------------------------\n");
		
		Encrypt encrypt1 = new Encrypt(ID,message,n,Public_key); 
		
		encrypt1.encrypt();
		
		
		
	}
}
