package task1;

import java.util.Scanner;

public class common {

	public static void main(String[] args) {
		int k=3;		// amount of fractions;
		
		fraction arr[] = new fraction [k];
		
		fillArr(arr, k);
		
		printArr(arr);

	}
	
	public static void fillArr(fraction arr[], int k) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++) {
			
			fraction setF = new fraction();
			
			System.out.println("Пожалуйста введите числитель и знаменатель " + (i+1) + "-й дроби");
			
			setF.setM(sc.nextInt());
			setF.setN(sc.nextInt());
			
			arr[i]=setF;
		}
		
	}
	
	public static void printArr(fraction arr[]) {
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(i+1+"-я дробь: " + arr[i].getM() + "/" + arr[i].getN());
			
		}
	}

}
