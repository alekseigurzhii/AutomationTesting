/*Conditions:
 * Программа вводит количество чисел N, а затем N вещественных чисел. Программа усекает вещественные числа и определяет, сколько среди усеченных чисел четных и >15.
 */

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		int n=0, cond=0, x=0;
		
		System.out.println("Пожалуйста, введите количество вещественных чисел");
		
		Scanner enter = new Scanner(System.in);
		
		if (enter.hasNextInt())
			n=enter.nextInt();
		
		System.out.println("Пожалуйста, введите вещественнык числа");
		for (int i=0; i<n; i++) {
		
			if (enter.hasNextDouble())
			cond=(int)enter.nextDouble();
			
			if ((cond % 2 == 0) && (cond >15))
				x++;
		}
		
		System.out.println("Количество четных усеченных чисел и более 15 : "+ x);
	}

}
