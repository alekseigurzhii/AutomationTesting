/*Conditions:
 * ��������� ������ ���������� ����� N, � ����� N ������������ �����. ��������� ������� ������������ ����� � ����������, ������� ����� ��������� ����� ������ � >15.
 */

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		int n=0, cond=0, x=0;
		
		System.out.println("����������, ������� ���������� ������������ �����");
		
		Scanner enter = new Scanner(System.in);
		
		if (enter.hasNextInt())
			n=enter.nextInt();
		
		System.out.println("����������, ������� ������������ �����");
		for (int i=0; i<n; i++) {
		
			if (enter.hasNextDouble())
			cond=(int)enter.nextDouble();
			
			if ((cond % 2 == 0) && (cond >15))
				x++;
		}
		
		System.out.println("���������� ������ ��������� ����� � ����� 15 : "+ x);
	}

}
