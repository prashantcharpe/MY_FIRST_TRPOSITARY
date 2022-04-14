package pravinprcice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InterviewQuestionAndAnser {

	// print from 1-10 without using any loop
	public static void metho(int a) {

		if (a < 11) {
			System.out.println(a);
			a++;
			metho(a); // it is recursive function
		}
	}

	// anagram string.
	public static void m2(String e, String f) {

		String a = e.replace(" ", "");
		String b = f.replace(" ", "");

		// 1st condition
		if (a.length() == b.length()) {
			System.out.println(" it anagaram");
		} else {
			System.out.println(" it anagaram");
		}

		// 2st condition
		char c[] = a.toLowerCase().toCharArray();
		char d[] = b.toLowerCase().toCharArray();
		Arrays.sort(d);
		Arrays.sort(c);
		System.out.println(Arrays.equals(c, d));

	}

	public static void duplicateword(String a) {

		String word[] = a.split(" ");

		Map<String, Integer> wordcount = new HashMap<String, Integer>();

		// check the wach word in given array
		for (String words : word) {
			if (wordcount.containsKey(words)) {
				wordcount.put(words, wordcount.get(words) + 1);
			} else {
				wordcount.put(words, 1);
			}
		}

		// extracting all the keys of map- wordcount
		// keyset return set of key , return type is set
		Set<String> wordsinstring = wordcount.keySet();

		for (String duplict : wordsinstring) {
			if (wordcount.get(duplict) > 1) {
				System.out.println(duplict + " : " + wordcount.get(duplict));
			}
		}

	}

	public static void COUNTduplicateCHARACTERstrig(String a) {
		char alphabest[] = a.replace(" ", "").toCharArray();

		Map<Character, Integer> wordcount = new HashMap<Character, Integer>();

		// check the wach word in given array
		for (Character words : alphabest) {
			if (wordcount.containsKey(words)) {
				wordcount.put(words, wordcount.get(words) + 1);
			} else {
				wordcount.put(words, 1);
			}
		}

		// extracting all the keys of map- wordcount
		// keyset return set of key , return type is set
		Set<Character> wordsinstring = wordcount.keySet();

		for (Character duplict : wordsinstring) {
			if (wordcount.get(duplict) > 1) {
				System.out.println(duplict + " : " + wordcount.get(duplict));
			}
		}

	}

	public static void countPerticularCharacterinString() {
		String a = "prashant";
		int b = a.length();
		String c = a.replace("a", "");
		int d = c.length();

		System.out.println("a count : " + (b - d));

	}

	public static void countPerticularwordinString() {
		String a = "my name is prashant and this is my no";
		String b[] = a.split(" ");
		int count;
		for (int i = 0; i < b.length; i++) {
			count = 1;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].equals(b[j])) {
					count++;
					System.out.println(b[i] + " : " + count);
				}
			}
		}
	}

	public static void swaipingwiththirdVeriable() {

		String a = "prashant";
		String b = "pravin";
		String c;
		System.out.println(" before swiping a : " + a);
		System.out.println(" before swiping b : " + b);
		c = a;
		a = b;
		b=c;
		System.out.println(" after swiping a : " + a);
		System.out.println(" after swiping b: " + b);
	}
	
	public static void swaipingwithoutthirdVeriable() {

		String a = "prashant";
		String b = "pravin";
		System.out.println(" before swiping a : " + a);
		System.out.println(" before swiping b : " + b);
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(" after swiping a : " + a);
		System.out.println(" after swiping b : " + b);
		
	}

	public static void main(String[] args) {
		// metho(1);
		 m2( "silent","lisent");
		// m2( "lives","elvi s");
		// String a = "hi am java and java is best language is good best";
		// duplicateword(a);
		// COUNTduplicateCHARACTERstrig( a);
		// countPerticularCharacterinString();
		//countPerticularwordinString();
		//swaipingwiththirdVeriable();
		//swaipingwithoutthirdVeriable();
	}
}
