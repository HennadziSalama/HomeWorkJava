package homework8;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		System.out.print("Введите текст: ");
		Scanner t = new Scanner(System.in);
		String text=t.next();
		System.out.println("Введенный текст: "+text);
				
		String Str = new String("Разделяем эту строку на слова");
		
	    for (String retval : text.split(" ")) {
	    	System.out.println(retval);
	    }
	}
}


