package homework8;

import java.util.Scanner;

public class PolindromNumbers {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Введите количество элементов массива n: ");
		int m = n.nextInt();
		int [] a = new int[m];
		Scanner h= new Scanner(System.in);
		for (int i=0; i<m;i++) {
			System.out.print("Введите "+i+" элемент массива: ");
			int p = h.nextInt();
			a[i]=p;
		}
		System .out.print("Массив: ");
		for (int i=0; i<m;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		boolean t = true;
		for(int i=0;i<m;i++)
			if(a[i]!=a[m-i-1])
			t=false;
		System.out.println(t?"Это полиндром ":" Это не полиндром");
	}
}
