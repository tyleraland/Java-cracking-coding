import java.util.*;
import java.util.stream.*;
import java.util.Collections;
public class ProjectEuler4 {
/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

   Find the largest palindrome made from the product of two 3-digit numbers.


 */
	
	// Generate {(X,Y) s.t. X,Y in 111..999}

	// Foreach product, determine if that number is a palindrome
	// Store palindromes in ArrayList
	// Take the largest element in the list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("121: " + isPalindrome(121));
		System.out.println("2332: " + isPalindrome(2332));
		System.out.println("1234: " + isPalindrome(1234));
		findPalindromes();
	}
    public static void findPalindromes(){    
		ArrayList<Integer> products = new ArrayList<Integer>();
//		IntStream x = IntStream.range(1,4);
		for (int i = 111; i <= 999; i++){
//			System.out.println(i);
//			IntStream.rangeClosed(111, 999).forEach(System.out::println);
			for (int j = 111; j <= 999; j++){
				if (isPalindrome(i*j)){
					products.add(i*j);
				}
			}
		}
		System.out.println(Collections.max(products));
		
	}
	
	public static boolean isPalindrome(int product){
		String str = Integer.toString(product);
		for (int i = 0; i < str.length()/2; i++){
/*			System.out.println("i: " + i);
			System.out.println(str.substring(i,i+1));
			System.out.println(str.substring(i, i + 1));
			System.out.println(str.substring(str.length()-i-1,
							   				 str.length()-i));
*/
			if (!str.substring(i, i + 1).equals(str.substring(str.length()-i-1,
										  			         str.length()-i))){
				return false;
			}
		}
		return true;
	}

}
