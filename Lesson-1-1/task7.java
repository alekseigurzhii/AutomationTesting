/*Conditions:
 * ��������� ������ ��� ����� a � b, ���� � > b, �� ��������� ������ ������ ����� � � ������� ����� b+c. ���� �=b, �� ��������� �������� ����� �������. ���� �<b, �� ��������� ������ ������ ����� �, ������� ����� a+b+c, ������� �� ����� ����� a+b+c � ����� ������ ���!�. 
 */

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		double a = 0, b = 0;
		double c = 0;
		Scanner en = new Scanner(System.in);
		
		System.out.print("Please enter a:");
		if (en.hasNextDouble())
			a=en.nextDouble();
		
		System.out.print("Please enter b:");
		if (en.hasNextDouble())
			b=en.nextDouble();
		
		if (a==b)
			System.out.println("Finish");

		else if (a>b)
			
			{
			System.out.print("Please enter c:");
			if (en.hasNextDouble())
				c=en.nextDouble();
			System.out.println("Sum of b+c: "+(b+c));
			}
		
		else 
			System.out.println(a+b+c+" New Year");

	}

}
