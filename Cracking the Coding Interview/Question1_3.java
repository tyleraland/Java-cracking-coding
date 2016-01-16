import java.util.*;
public class Question1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charbuf = " remove  the spaces            ".toCharArray();
		System.out.println(URLify(charbuf, 19));
	}

	public static char[] URLify(char[] buffer, int strlen){
		int spaces = 0;
		Deque<Character> stack = new LinkedList<Character>();	
		for (int i = 0; i < strlen; i++){
			if (buffer[i] == ' '){
				spaces += 1;
				stack.addFirst('%');
				stack.addFirst('2');
				stack.addFirst('0');
			} else {
				stack.addFirst(buffer[i]);
			}
		}
		System.out.println(spaces + " spaces");
		for (int i = strlen + 2*spaces - 1; i >= 0; i--){
			buffer[i] = stack.removeFirst();
		}
		return buffer;
//		return "";
	}
}
