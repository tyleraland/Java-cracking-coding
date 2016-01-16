import java.util.Arrays;
public class Question1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUnique("abc"));
		System.out.println(isUnique("aac"));
		System.out.println(isUnique("abcdd"));

	}

	public static boolean isUnique(String word){
		boolean[] count = new boolean[256];
		Arrays.fill(count, false);
		for(char ch: word.toCharArray()){
			int index = (int) ch - (int) 'a';
			if (!count[index]){
				count[index] = true;
			}else{
				return false;
			}
//			System.out.println(index);
		}
		return true;
	}
}
