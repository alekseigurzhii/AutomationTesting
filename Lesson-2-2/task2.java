import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		String month;
		int year;
		int numDays=0;
		
		month=mnth();
		year=yr();
		numDays=list(month, year);
		System.out.println("Число дней = " + numDays);
	}
	
	public static String mnth() {
		String month;
		Scanner sc = new Scanner(System.in);
		return month=sc.next();
	}
	
	public static int yr() {
		int year;
		Scanner sc = new Scanner(System.in);
		return year=sc.nextInt();
	}
	
	public static int list(String month, int year) {
		int numDays = 0;
		switch(month) {
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			numDays = 31;
			break;
		case "April":
		case "June":
		case "September":
		case "November":
			numDays = 30;
			break;
		case "Febrary":
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
				numDays = 29;
			else
				numDays = 28;
			break;
		default:
			System.out.println("Несуществующий месяц");
			break;
		}
		return numDays;
	}

}
