
public class task3 {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,1,7};
		boolean ans;
		
		ans=answer(arr);
		
		if (ans==true)
			System.out.println("������������ ������� ��������� ������������ �� �����������");
		else
			System.out.println("������������ ������� ��������� ������������ �� �� �����������");
	}
	
	public static boolean answer(int arr[]) {
		
		boolean theAnswer=true;
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i-1]<=arr[i])
			{}
			else 
				theAnswer=false;
		}
		
		return theAnswer;
	}

}
