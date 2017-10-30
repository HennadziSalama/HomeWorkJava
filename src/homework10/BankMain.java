package homework10;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Accounts a1 = new Accounts ();
		Accounts a2 = new Accounts ();
		Converter c1 = new Converter();
		a1.depBYR(1000);
		a1.depEUR(15);

		System.out.println("Acc 1 previous balance: " + a1.getBalance());
		System.out.println("Acc 2 previous balance: " + a2.getBalance());
		    
		a1.transferTo(a2, 15);

		System.out.println("Acc 1 new balance: " + a1.getBalance());
		System.out.println("Acc 2 new balance: " + a2.getBalance());
	}	
}


