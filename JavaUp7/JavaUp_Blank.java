package JavaUp7;

public class JavaUp_Blank {
	public static String HanBlankForeword(String word, int number) {
		String kp5_blank = "";
		int kp5_wordlength = word.getBytes().length;

		for (int j = 0; j < number - kp5_wordlength; j++) {
			kp5_blank += " ";
		}
		return kp5_blank + word;
	}

	public static String HanBlankBackword(String word, int number) {
		String kp5_blank = "";
		int wordlength = word.getBytes().length;

		for (int j = 0; j < number - wordlength; j++) {
			kp5_blank += " ";
		}
		return word + kp5_blank;
	}

	public static String HanCount(String word) {
		String str = "";
		int cnt = 0;
		;
		for (int j = 0; j < word.length(); j++) {
			int index = word.charAt(j);
			if (!(index >= 0 && index < 127)) {
				cnt++;
			}
		}
		str = Integer.toString(cnt);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("HandBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15));
		System.out.printf("HandBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15));
		System.out.printf("HandBlankBackword[%s]\n", HanBlankBackword("한글aa", 15));
		System.out.printf("HandBlankBackword[%s]\n", HanBlankBackword("한글한글aa", 15));
		System.out.printf("한글은 [%s]개\n", HanCount("한글한글aa"));
	}

}
