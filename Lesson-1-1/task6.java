/*Conditions:
 * ��������� ����������� � ������������ a,b,c ,��������� �������� ��������� a2-(bc)2+ln(b2+1). 
 */

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		double a=0, b = 0 , c=0;
		double f;
		
		Scanner en = new Scanner(System.in);
		System.out.print("������� a: ");
		if (en.hasNextDouble())
			a=en.nextDouble();
		System.out.print("������� b: ");
		if (en.hasNextDouble())	
			b=en.nextDouble();
		System.out.print("������� c: ");
		 if (en.hasNextDouble())
			 c=en.nextDouble();
		 
		 System.out.println("������� ����������: a2-(b-c)2+ln(b2+1)");
			 f=a*a-(b-c)*(b-c)+Math.log(b*b+1);
			
		 System.out.println("�����: "+f);

	}

}
