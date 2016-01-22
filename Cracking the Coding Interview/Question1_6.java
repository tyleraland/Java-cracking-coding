
public class Question1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("abbcccddddeeeffg"));
		System.out.println(compress("abra cadabra"));
	}
	public static String compress(String instring){
		StringBuilder outstring = new StringBuilder();
		char last = '\0';
		Integer lastcount = 0;
		for (char ch : instring.toCharArray()){
			if (ch == last){
			} else if (lastcount > 1){ // Previous char had 2+ copies, compress
				for (char digit : lastcount.toString().toCharArray()){
					outstring.append(digit);
				}
				outstring.append(ch);
				lastcount = 0;
			} else { // Previous char was a singleton, just write it out
				outstring.append(ch);
				lastcount = 0;
			}
			lastcount += 1;
			last = ch;
		}
		if (instring.length() <= outstring.toString().length()){
			return instring;
		} else {
			return outstring.toString();			
		}
	}
}
