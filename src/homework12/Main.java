package homework12;

public class Main {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(150, 0);
		try {
			int plus = Logic.add(c1);
			c1.showResInt(plus);
			double sum = Logic.divide(c1);
			c1.showResDouble(sum);
		} catch (ZeroException e) {
			System.out.println(e.getMessage());
		} catch (Error e){
			System.err.println(e.getMessage());
		}
	}
}



