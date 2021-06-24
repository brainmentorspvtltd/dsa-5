import java.util.ArrayList;

public class LetterCombinations {
	
	static String keyPadKeys[] = {"","+@$","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	static ArrayList<String> keypad(String number) {
		if(number.length() == 0) {
			ArrayList<String> str = new ArrayList<String>();
			str.add("");
			return str;
		}
		char firstChar = number.charAt(0);	// 2
		String remainingString = number.substring(1);	// 3
		int index = firstChar - '0';	// '2' - '0' = 2
		String keyPadKey = keyPadKeys[index];	// "abc"
		ArrayList<String> finalString = new ArrayList<String>();
		for(int i = 0; i < keyPadKey.length(); i++) {
			ArrayList<String> temp = keypad(remainingString);
			for(String s : temp) {
				finalString.add(keyPadKey.charAt(i) + s);
			}
		}
		return finalString;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(keypad("23"));
	}

}
