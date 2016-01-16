import java.util.*;
public class Question1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermutation("abc", "cba"));
		System.out.println(isPermutation("xy", "xyy"));
		System.out.println(isPermutation("abc", "abcabc"));
		System.out.println(isPermutation("abc", ""));
		System.out.println(isPermutation("aaabb", "ababa"));
	}

	public static boolean isPermutation(String strA, String strB){
		HashMap<Character, Integer> counts = new HashMap<Character,Integer>();
		if (strA.length() != strB.length()) return false;
		for (int a = 0; a < strA.length(); a++){
			char charA = strA.charAt(a);
			if (counts.containsKey(charA)){
				counts.replace(charA, counts.get(charA) + 1);
			} else {
				counts.put(charA, 1);
			}
		}
//		System.out.println(counts);
//		counts.replace(charA, counts.get(charA) + 1);
		for (int b = 0; b < strB.length(); b++){
			char charB = strB.charAt(b);
			if (counts.containsKey(charB) && (counts.get(charB) > 0)){
				counts.replace(charB,  counts.get(charB) - 1);
			} else {
				return false;
			}
		}
		return true;
		
	}
}
