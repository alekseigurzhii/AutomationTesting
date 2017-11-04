/*Conditions:
 * Программа запрашивает количество чисел, затем вводит целые числа в соответствии с указанным количеством. Определяет количество четных, сумму кратных 3-м и количество чисел, модуль которых <3 
 */

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		int n=0, ch=0, sum3=0, amod3=0, op=0;
		
		Scanner am = new Scanner(System.in);
		System.out.println("Пожалуйста, введите общее количество чисел:");
		if (am.hasNextInt())
			n=am.nextInt();
		
		for(int i=0; i<n; i++) {
				op=am.nextInt();
			if (op % 3 == 0)	//Проверка кратности 3
				sum3=sum3+op;
			if (op % 2 == 0 )	// Проверка четности
					ch++;
			if (Math.abs(op)<3) // Проверка модуля
				amod3++;
				
		}
		
		System.out.println("Количество четных : " + ch);
		System.out.println("Сумма кратных 3-м : " + sum3);
		System.out.println("Количество чисел модуль которых меньше 3-х :" + amod3);

	}

}
