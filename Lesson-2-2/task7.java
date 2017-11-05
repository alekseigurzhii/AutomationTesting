import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		double mas[] = new double[10];
		double max, min;
		int index;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i =0; i<10; i++) {		//array filling
			mas[i]=sc.nextDouble();
		}
		
		max=mas[0];
		min=mas[0];
		index=0;
		
		for (int i=0; i<10; i++) {		// looking for max, min element and index of min element before sort
			if (max<mas[i])
				max=mas[i];
			if (min>mas[i])
				{min=mas[i];
						index=i;};
		}

		System.out.println("Max element: " + max);
		System.out.println("Min element: " + min + "; "+ "Index of min element: "+ index);
		
		for (int i=0;  i<mas.length-1;i++) {		//sorting
		 		int least = i;
		 		
		 		for (int k=i+1; k<mas.length;k++) {
		 		    if(mas[k] < mas[least]) {
		 				least = k;
		 			}
		 		}
		 		
		 		double tmp = mas[i];
		 		mas[i] = mas[least];
		 		mas[least] = tmp;
				}
		
		System.out.println("Sorted array:");
		
		for(int i=0; i<10; i++) {
			System.out.println(mas[i]);
		}
	}

}
