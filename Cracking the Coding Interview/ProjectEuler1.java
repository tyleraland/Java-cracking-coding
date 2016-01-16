
public class ProjectEuler1 {
/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create array of 1..1,000 O(n)
		// Set value=key foreach element O(n)
		// Filter the array O(n)
		final int N = 1000;
		int total = 0;
		for (int i = 0; i < N; i++) 
			if ((i % 3 == 0) || (i % 5 == 0)){
				System.out.println(i);
				total = total + i;
			}
		System.out.println(total);
	}

}
