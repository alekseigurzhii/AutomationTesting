/*Conditions
 * Программа вводит два числа a и b, если a=b, то вывести на экран слова «скоро Новый Год!», в противном случае ввести третье число с и вывести на экран 3 строки : -значение выражения a+b+c -значение  выражения 𝑎2 + 𝑏2 -«моя любимая футбольная команда»
 */

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		int a=0, b=0;
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Enter a:");
		if (en.hasNextInt())
			a=en.nextInt();
		
		System.out.println("Enter b:");
		if (en.hasNextInt())
			b=en.nextInt();
		
		if (a==b)
			System.out.println("скоро Новый Год!");
		else
			{int c=0;
			System.out.println("Enter c:");
			if (en.hasNextInt())
				c=en.nextInt();
			
				System.out.println(a+b+c);
				System.out.println(a*a+b*b);
				System.out.println("моя любимая футбольная команда");}


	}

}
