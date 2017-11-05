import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		int x;
		int y;
		int sum, mul;
		
		x=ent();	//enter the number X
		y=ent();	//enter the number X
		
		sum = sumNum(x,y);	
		mul = mulNum(x,y);
		
		System.out.println("sum = " + sum + "; mul = " + mul); 
	}
	
	public static int ent() {
		Scanner conin = new Scanner(System.in);
		
		System.out.println("¬ведите число: ");
		while(!conin.hasNextInt())  {    
			conin.next();   
			}
		
		int x = conin.nextInt();
		
		return x; 
	}
	
	public static int sumNum(int x, int y) {
		int sum;
		return sum=x+y;
	}
	
	public static int mulNum(int x, int y) {
		int mul;
		return mul=x*y;
	}

}
