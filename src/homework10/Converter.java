package homework10;

public class Converter {
protected static double balance;
	
	public static void  EURtoUSD(double eur){
		final double usd = 1.16;
		balance = eur * usd;
	}
	public static void  BYRtoUSD(double byr){
		final double usd = 0.51;
		balance = byr * usd;
	}
}
