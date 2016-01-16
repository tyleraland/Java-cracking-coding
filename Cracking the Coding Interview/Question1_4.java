import java.util.*;
public class Question1_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasPermutation("taco cat"));
	}

	public static boolean hasPermutation(String instring){
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		int evens = 0, odds = 0;
		for (char ch : instring.toCharArray()){
			if (ch == ' '){
				continue;
			} else if (!count.containsKey(ch)){
				count.put(ch, 1);
				odds = odds + 1;
			} else {
				count.put(ch, count.get(ch) + 1);
				if (count.get(ch) % 2 == 0){
					evens = evens + 1;
					odds = odds - 1;
				} else {
					odds = odds + 1;
					evens = evens - 1;
				}
			}
		}
		if (odds > 1){
			return false;
		} else {
			return true;
		}
	}
	
}
