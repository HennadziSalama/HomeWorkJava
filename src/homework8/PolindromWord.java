package homework8;

import java.util.Scanner;

public class PolindromWord {

	public static void main(String[] args) {
		System.out.print("Введите слово: ");
		Scanner word = new Scanner(System.in);
		String slovo=word.next();
		System.out.println("Введенное слово: "+slovo);
		
		String [] s=slovo.split("");
		int k=slovo.length();
		System .out.println("Количество символов в слове: "+k);
		System .out.print("Массив из слова: ");
		for (int i=0; i<k;i++) {
			System.out.print(s[i]);	
		}
		System.out.println();
		boolean u = true;
		for(int i=0;i<k;i++)
			if(s[i]!=s[k-i-1])
			u=false;
		System.out.println(u?"Это полиндром":"Это не полиндром");
	}

}
