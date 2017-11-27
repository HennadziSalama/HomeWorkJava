package homework16;

public class BankMain {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.carrency = Carrency.BLR;
		acc1.summa = 2000;
		
		Account acc2 = new Account();
		acc2.carrency = Carrency.PLN;
		acc2.summa = 2000;
		
		acc1.deposit(1000, acc2);
		
		System.out.println(acc1.summa);
		System.out.println(acc2.summa);
	}
}
