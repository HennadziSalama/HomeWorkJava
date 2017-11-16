package homework12;

public class Logic {
	public static int add(Calculator cal){
		return cal.getX() + cal.getY();
	}
	public static int substruct(Calculator cal){
		return cal.getX() - cal.getY();
	}
	public static int multiply(Calculator cal) {
			return cal.getX() * cal.getY();
	}
	public static double divide(Calculator cal) throws ZeroException {
		if (cal.getX() < 0 || cal.getY() < 0 ){
			return cal.getX() / cal.getY();
		}else{
			throw new ZeroException("Can`t divide by zero");
		}
	}
}


