package homework1;

import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
				
//		Первая задача
		Scanner numb1=new Scanner(System.in);  
		System.out.print("Введите 1-ое число: ");
		int a=numb1.nextInt();
		Scanner numb2=new Scanner(System.in);  
		System.out.print("Введите 2-ое число: ");
		int b=numb2.nextInt();
		Scanner operation=new Scanner(System.in);  
		System.out.print("Введите операцию: ");
		String c=operation.next();
		switch (c){
			case "+": 
				int result1=a+b;
				System.out.print("Результат: "+a+"+"+b+"="+result1);
			break;
			case "-": 
				int result2=a-b;
				System.out.print("Результат: "+a+"-"+b+"="+result2);
			break;
			case "*": 
				int result3=a*b;
				System.out.print("Результат: "+a+"*"+b+"="+result3);
			break;
			case "/": 
				int result4=a/b;
				System.out.print("Результат: "+a+"/"+b+"="+result4);
			break;
				default: 
				System.out.print("Не верный оператор");
			break;
		}
	}
}

