/*Conditions:
 * ��������� ����������� ���������� �����, ������ ����� ����� � ������������ � ���������� ����������� ,����������, ������� ����� ������ 15 ��� <2, ���� ����� ����� �����, ������� ������� �� 5 � �������� 4. ��������� ������� �� �����.
 */

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		int x=0,counter=0, sum=0, div=0;
		
		System.out.println("������� ���������� �����:");
		Scanner en = new Scanner(System.in);
		
		if (en.hasNextInt())
			x=en.nextInt();
		
		System.out.println("������� �����:");
		
		for (int i=0; i<x; i++) {
			
			div=en.nextInt();
			
			if ( (div>15) || (div<2) )
				counter++;
			
			if (div % 5 == 4)
				sum=sum+div;
		}
		
		System.out.println("���������� ����� ������� ������ 15 ��� ������ 2: "+counter);
		System.out.println("����� ����� ������� ������� �� 5 � �������� 4: "+sum);

	}

}
