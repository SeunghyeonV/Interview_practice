import java.util.*;

public class StringPermutation {

	static boolean permutationTest(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = new String("abcde");
		String str2 = new String("dfcba");
		System.out.println(permutationTest(str1, str2));
	}
}
