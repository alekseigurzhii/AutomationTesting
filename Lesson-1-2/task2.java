/*Conditions:
 * ��������� ����������� ���������� �����, ����� ������ ����� ����� � ������������ � ��������� �����������. ���������� ���������� ������, ����� ������� 3-� � ���������� �����, ������ ������� <3 
 */

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		int n=0, ch=0, sum3=0, amod3=0, op=0;
		
		Scanner am = new Scanner(System.in);
		System.out.println("����������, ������� ����� ���������� �����:");
		if (am.hasNextInt())
			n=am.nextInt();
		
		for(int i=0; i<n; i++) {
				op=am.nextInt();
			if (op % 3 == 0)	//�������� ��������� 3
				sum3=sum3+op;
			if (op % 2 == 0 )	// �������� ��������
					ch++;
			if (Math.abs(op)<3) // �������� ������
				amod3++;
				
		}
		
		System.out.println("���������� ������ : " + ch);
		System.out.println("����� ������� 3-� : " + sum3);
		System.out.println("���������� ����� ������ ������� ������ 3-� :" + amod3);

	}

}
