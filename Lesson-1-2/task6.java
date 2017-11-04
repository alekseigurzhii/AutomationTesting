
public class task6 {

	public static void main(String[] args) {
		int a=5, b=2, c=3, d=6;
		double res=0;
		
		System.out.println("Число a="+a);
		System.out.println("Число b="+b);
		System.out.println("Число c="+c);
		System.out.println("Число d="+d);
		
		res = ((b+Math.sqrt(b*b+4*a*c))/2*a - a*a*a*c+b);
		System.out.println("Ответ на пример А: "+res);
		
		res = ((a/c)*(b/d) - (a*b-c)/c*d);
		System.out.println("Ответ на пример B: "+res);

	}

}
