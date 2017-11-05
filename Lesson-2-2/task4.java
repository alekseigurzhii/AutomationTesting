import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		String numMonth;
		
		System.out.println("Please, enter the number of month:");
		Scanner sc = new Scanner(System.in);
		numMonth=sc.next();
		
		if((numMonth.equals("twelve")) || (numMonth.equals("one")) || (numMonth.equals("two")))
			System.out.println("Winter");
		
		else if ((numMonth.equals("three")) || (numMonth.equals("four")) || (numMonth.equals("five")))
			System.out.println("Spring");
		
		else if ((numMonth.equals("six")) || (numMonth.equals("seven")) || (numMonth.equals("eight")))
			System.out.println("Summer");
		
		else if ((numMonth.equals("nine")) || (numMonth.equals("ten")) || (numMonth.equals("eleven")))
		    System.out.println("Automn");
		else 
			System.out.println("Month doesn't exist");
	}
}
