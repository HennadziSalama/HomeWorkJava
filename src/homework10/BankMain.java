package homework10;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner name1 = new Scanner(System.in);
		System.out.print("��� � ������� 1-�� �������: ");
		String n1 = name1.nextLine();
		Clients Name1 = new Clients(n1);
		Name1.setName(n1);
		Scanner name2 = new Scanner(System.in);
		System.out.print("��� � ������� 2-�� �������: ");
		String n2 = name2.nextLine();
		Clients Name2 = new Clients(n2);
		Name2.setName(n2);
		
		
	}

}
