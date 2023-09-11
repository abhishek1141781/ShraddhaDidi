package apna.strings;

public class StringCompression {

	public static String compress(String str) {
		String compressed = "";

		for (int i = 0; i < str.length(); i++) {		// O(n)
			int count = 1;

			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
//			for (int j = i + 1; j < longString.length(); j++) {
//				if (longString.charAt(i) == longString.charAt(j))
//					count++;
//				else
//					break;
//			}

			compressed += str.charAt(i);
			if (count > 1)
				compressed += Integer.toString(count);
		}

		return compressed;
	}

	public static void main(String[] args) {
		String decompressedString = "aaavvvvcddsssa";
		System.out.println(compress(decompressedString));
	}
}
