/*Conditions:
 * Программа запрашивает количество чисел, вводит целые числа в соответствии с заявленным количеством ,определяет, сколько чисел больше 15 или <2, чему равна сумма чисел, которые делятся на 5 с остатком 4. Результат вывести на экран.
 */

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		int x=0,counter=0, sum=0, div=0;
		
		System.out.println("Введите количество чисел:");
		Scanner en = new Scanner(System.in);
		
		if (en.hasNextInt())
			x=en.nextInt();
		
		System.out.println("Введите числа:");
		
		for (int i=0; i<x; i++) {
			
			div=en.nextInt();
			
			if ( (div>15) || (div<2) )
				counter++;
			
			if (div % 5 == 4)
				sum=sum+div;
		}
		
		System.out.println("Количество чисел которые больше 15 или меньше 2: "+counter);
		System.out.println("Сумма чисел которые делятся на 5 с остатком 4: "+sum);

	}

}
