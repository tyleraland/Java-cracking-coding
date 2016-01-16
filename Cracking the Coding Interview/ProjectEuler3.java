import java.util.*;

public class ProjectEuler3 {

	// Largest prime factor of 600851475143
	// start with variable "principle"
	// i
	// Find all factors first, store them in ArrayList
	// Iterate through factors in reverse, return first one that's prime
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestPrimeFactor(9));
		System.out.println(largestPrimeFactor(15));
		System.out.println(largestPrimeFactor(600851475143L));
	}

	public static long largestPrimeFactor(long n){
		// What are n's prime factors?  Then take the maximum
		long sentinel = n;
		long candidate = 1;
		List<Long> factors = new ArrayList<Long>();	
		while (candidate <= sentinel){
			if (n % candidate == 0 && isPrime(candidate)){
				assert sentinel % candidate == 0;
				factors.add(candidate);
				sentinel = sentinel / candidate;
			}
			candidate++;
		}
		return factors.get(factors.size()-1);
	}
	public static boolean isPrime(long candidate){
		for (long i=2; i < candidate; i++){
			if (candidate % i == 0) return true;
		}
		return true;
	}
}
