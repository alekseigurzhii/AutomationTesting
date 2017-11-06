
public class task4 {

	public static void main(String[] args) {
		int arr[] = new int [] {1, 45, 5, 7, 1, 9, 33, 1, 1, 321};
		int length=checkLength(arr);

		if (length==0)
			System.out.println("В массиве нет четных чисел");
		else
		{createNewArr(arr, length);
		}
	}
	
	public static int checkLength(int arr[]) {		//determine length of the new array
		int length=0;
		
		for (int i=0; i < arr.length; i++) {
			if (arr[i] % 2 ==0)
				length++;				
		}
		
		return length;
	}
	
	public static void createNewArr(int arr[], int length) {		//filling new array and print it in console
		int newArr[] = new int[length];
		int count=0;
		
		for (int i=0; i < arr.length; i++) {
			
			if (arr[i] % 2 ==0)
			{newArr[count]=arr[i];
				count++;
			}
		}
		
		for (int i=0; i<newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		
	}

}
