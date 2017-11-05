import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		String first, second;
		
		Scanner sc = new Scanner(System.in);
		
		first=sc.next();
		second=sc.next();
		
		if (first==second)
			System.out.println("You cann't compare lines with ==");
		else 
			System.out.println("You cann't compare lines with ==");
		
		if (first.equals(second))
			System.out.println("Absolutely the same lines");
		else 
			System.out.println("Not the same");

	}

}
