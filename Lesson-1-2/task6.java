
public class task6 {

	public static void main(String[] args) {
		int a=5, b=2, c=3, d=6;
		double res=0;
		
		System.out.println("����� a="+a);
		System.out.println("����� b="+b);
		System.out.println("����� c="+c);
		System.out.println("����� d="+d);
		
		res = ((b+Math.sqrt(b*b+4*a*c))/2*a - a*a*a*c+b);
		System.out.println("����� �� ������ �: "+res);
		
		res = ((a/c)*(b/d) - (a*b-c)/c*d);
		System.out.println("����� �� ������ B: "+res);

	}

}
