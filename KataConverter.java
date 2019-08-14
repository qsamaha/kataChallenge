
public class KataConverter {
	
	public static void main(String[] args) {
		KataConverter k = new KataConverter();
		System.out.println(k.convert(1));
	}

	public String convert(int a) {
		String letter = Integer.toString(a);

		char b = letter.charAt(0);
		System.out.println(b);

		String result = "";
		if (letter.length() == 1) {
			result = numToText(b);
		} else if (letter.length() == 2) {
			char c = letter.charAt(1);
			System.out.println(c);
			System.out.println(letter);
			return result = numToText2(b, c);
		}
		return result;

	}

	public String numToText(char b) {
		String result = "";
		if (b == '0') {
			result = "zero";

		} else if (b == '1') {
			result = "one";

		} else if (b == '2') {
			result = "two";

		} else if (b == '3') {
			result = "three";

		} else if (b == '4') {
			result = "four";

		} else if (b == '5') {
			result = "five";

		} else if (b == '6') {
			result = "six";

		} else if (b == '7') {
			result = "seven";

		} else if (b == '8') {
			result = "eight";

		} else if (b == '9') {
			result = "nine";

		}
		return result;

	}

	public String numToText2(char a, char b) {
		System.out.println(a);
		String letter = Character.toString(a);
		System.out.println("a" + letter);
		String letter2 = Character.toString(b);
		letter = letter + letter2;
		System.out.println("letter" +letter);
		String result = "";

		if (letter.length() == 2) {
			char c = letter.charAt(0);
			char e = letter.charAt(1);

			if (c == '1' && e == '0') {
				result = "ten";

			} else if (c == '1' && e == '1') {
				result = "eleven";

			} else if (c == '1' && e == '2') {
				result = "twelve";

			} else if (c == '1' && e == '3') {
				result = "thirteen";

			} else if (c == '1' && e == '4') {
				result = "fourteen";

			} else if (c == '1' && e == '5') {
				result = "fifteen";

			} else if (c == '1' && e == '6') {
				result = "sixteen";

			} else if (c == '1' && e == '7') {
				result = "seventeen";

			} else if (c == '1' && e == '8') {
				result = "eighteen";

			} else if (c == '1' && e == '9') {
				result = "nineteen";
			} else if (c == '2') {
				result = "twenty " + numToText(letter.charAt(1));

			} else if (c == '3') {
				result = "thirty " + numToText(letter.charAt(1));

			} else if (c == '4') {
				result = "forty " + numToText(letter.charAt(1));

			} else if (c == '5') {
				result = "fifty " + numToText(letter.charAt(1));

			} else if (c == '6') {
				result = "sixty " + numToText(letter.charAt(1));

			} else if (c == '7') {
				result = "seventy " + numToText(letter.charAt(1));

			} else if (c == '8') {
				result = "eighty " + numToText(letter.charAt(1));

			} else if (c == '9') {
				result = "ninety " + numToText(letter.charAt(1));
			}
		}
		return result;
	}

}
