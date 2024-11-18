package day4;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String str1 = "Race"; // {'a','c', 'e' , 'r'}
		String str2 = "Care"; // acer

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				System.out.println(" Strings are anagrams"+ str1 +" "+str2);
			} else {
				System.out.println(" Stirngs are not anagrams"+ str1 +" "+str2);
			}
		}
		
	}
}
