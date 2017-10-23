package homework1;

import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {

//		Первая задача
		Scanner numb1 = new Scanner(System.in);
		System.out.print("Ввведите 1-ое число: ");

		int a = numb1.nextInt();
		Scanner numb2 = new Scanner(System.in);
		System.out.print("Ввведите 2-ое число: ");
		int b = numb2.nextInt();
		Scanner operation = new Scanner(System.in);
		System.out.print("������� ��������: ");
		String c = operation.next();
		switch (c) {
			case "+":
				int result1 = a + b;
				System.out.print("���������: " + a + "+" + b + "=" + result1);
				break;
			case "-":
				int result2 = a - b;
				System.out.print("���������: " + a + "-" + b + "=" + result2);
				break;
			case "*":
				int result3 = a * b;
				System.out.print("���������: " + a + "*" + b + "=" + result3);
				break;
			case "/":
				int result4 = a / b;
				System.out.print("���������: " + a + "/" + b + "=" + result4);
				break;
			default:
				System.out.print("�� ������ ��������");
				break;
		}
	}
}

