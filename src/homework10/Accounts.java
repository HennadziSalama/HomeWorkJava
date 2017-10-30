package homework10;

import java.util.Random;

public class Accounts {
		private double balance;
		private int deposit;
		public Accounts(double balance){
			this.balance = balance;
		}
		public Accounts(int accounts, double balance){
			this.balance = balance;
		}
		public void setBalance(){
			balance = Math.random() * 1000;
			balance = Math.round((balance * 100.0)+.5) / 100.0;
		}
		public void depUSD(double amount){
			balance = balance + amount;
		}
		public void depBYR(double amount){
			Converter.BYRtoUSD(amount);
			balance = balance + Converter.balance;
		}
		public void depEUR(double amount){
			Converter.EURtoUSD(amount);
			balance = balance + Converter.balance;
		}
		public void withdraw(double amount){
			balance = balance - amount;
		}
		public double getBalance(){
			return balance;
		}
		public void transferTo(Accounts owner, double amount){
			if(amount <= this.balance){
				withdraw(amount);
				owner.depUSD(amount);
				System.out.println("Success " + amount);
			}
			else{
				System.out.println("Not enough balance " + balance);
			}
	  }
}


