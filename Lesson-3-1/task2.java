
public class task2 {

	public static void main(String[] args) {
		int array[] = new int [] {9, 0, 5, 0, 3, 4, 0, 22 };
		int lenNewAr=0;		// variable which will determine size of the new array
		int fil=0;
		
		System.out.println("Given array:");
		
		for (int i=0; i < array.length; i++) {		//looking for zero inside array;
			
			System.out.println(array[i]);
			
			if (array[i]==0)
				lenNewAr++;				
		}
		
		int newArray[] = new int [lenNewAr];		// create new array where length = lenNewAr
		
		for (int i=0; i < array.length; i++) {		//filling new array 
			if (array[i]==0)
			{newArray[fil]=i;
			fil++;
			}		
		}
		
		System.out.println("New array:");
		
		for (int i =0; i < newArray.length; i++) {		// print new array
			System.out.println(newArray[i]);	
		}

	}

}
