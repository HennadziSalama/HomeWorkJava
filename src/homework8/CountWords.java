package homework8;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		System.out.print("������� �����: ");
		Scanner t = new Scanner(System.in);
		String text=t.next();
		System.out.println("��������� �����: "+text);
				
		String Str = new String("��������� ��� ������ �� �����");
		
	    for (String retval : text.split(" ")) {
	    	System.out.println(retval);
	    }
	}
}


