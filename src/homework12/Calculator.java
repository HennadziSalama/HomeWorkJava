package homework12;

public class Calculator {
		
		private int x;
		private int y;
		
		public Calculator(){}
		
		public Calculator(int x, int y){
			this.x = x;
			this.y = y;
		}
		public void showResInt(int result){
			System.out.println(result);
		}
		public void showResDouble(double result){
			System.out.println(result);
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
	}
}

