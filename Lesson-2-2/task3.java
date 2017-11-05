import java.util.Scanner;



public class task3 {
	

	public static void main(String[] args) {
		String numMonth;
		Season theSeason;
		
		System.out.println("Please, enter the number of month:");
		Scanner sc = new Scanner(System.in);
		numMonth=sc.next();
		
		theSeason=Season.valueOf(numMonth);
		
		switch(numMonth) {
		case "twelve":
		case "one":
		case "two":
			System.out.println("Winter");
			break;
		case "three":
		case "four":
		case "five":
			System.out.println("Spring");
			break;
		case "six":
		case "seven":
		case "eight":
			System.out.println("Summer");
			break;
		case "nine":
		case "ten":
		case "eleven":
			System.out.println("Automn");
			break;
		
		}
	}

	public enum Season{
		one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve	
	}
}
