package apna.strings;

public class TitleCase {

	public static String titleCase(String str) {
		StringBuilder sbr = new StringBuilder("");

		char ch = Character.toUpperCase(str.charAt(0));
		sbr.append(ch);

		for (int i = 1; i < str.length(); i++) {			// O(n)
			if (str.charAt(i - 1) == ' ')
				sbr.append(Character.toUpperCase(str.charAt(i)));
			else
				sbr.append(str.charAt(i));
		}

		return sbr.toString();
	}

	public static void main(String[] args) {
		String sentCase = "hi, i am abhishek gupta";
		System.out.println(titleCase(sentCase));
	}
}
