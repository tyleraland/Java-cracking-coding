import java.lang.Math.*;
import java.lang.Math;
public class Question1_5 {

	/*
	 * Determine if two strings are one edit away
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oneEditAway("string1", "string2")); // edit
		System.out.println(oneEditAway("string1", "string12")); // deletion
		System.out.println(oneEditAway("string", "string2")); // insertion
		System.out.println(oneEditAway("string", "string12")); // two deletions away
		System.out.println(oneEditAway("string12", "string")); // two insertions away
		System.out.println(oneEditAway("string", "str!ing")); // one insertion in the middle
		System.out.println(oneEditAway("string1", "str!ing2")); // one edit, one insertion

	}
	public static boolean oneEditAway(String st1, String st2){
		int max, diffs = 0;
		String small, large;
		if (st1.length() > st2.length()){
			large = st1; small = st2;
		} else {
			small = st1; large = st2;
		}
		if (Math.abs(st1.length() - st2.length()) > 2){
			return false;
		} else {
			max = Math.max(st1.length(), st2.length());
		}
		for (int i=0, j=0; i < max; i++){
//			System.out.println(small + " " + j);
//			System.out.println(diffs);
			if (j == small.length()){
				diffs += 1;
			} else if (large.charAt(i) != small.charAt(j)){
				diffs += 1;
			} else {
				j++;
			}
			if (diffs > 1){
				return false;
			}
		}
		return true;
	}
}
