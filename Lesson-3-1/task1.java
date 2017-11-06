
public class task1 {

	public static void main(String[] args) {
		int k=3;
		int a[]= new int[10];
		int d=10;
		int sum=0;
		
		for (int i=0; i < a.length; i++) {
			
			a[i]=(int)(Math.random()*d);	// filling the array with random numbers, mult. on 'd' - set range
			
			System.out.println(a[i]);
			
			if (a[i] % k == 0)
				sum=sum+a[i];
		}
		
		System.out.println("Сумма чисел кратных К = " + sum);

	}

}
