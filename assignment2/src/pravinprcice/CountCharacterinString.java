package pravinprcice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharacterinString {


	public static void COUNTduplicateCHARACTERstrig(String a) {
		char alphabest []= a.replace(" ", "").toCharArray();
		

		Map<Character, Integer> wordcount = new HashMap<Character, Integer>();

		// check the wach word in given array
		for (Character words : alphabest) {
			if (wordcount.containsKey(words)) {
				wordcount.put(words, wordcount.get(words) + 1);
			} else {
				wordcount.put(words, 1);
			}
		}

        //extracting all the keys of map- wordcount
		//keyset return set of  key , return type is set
		Set<Character> wordsinstring = wordcount.keySet();
		
		for(Character duplict : wordsinstring ) {
			if(wordcount.get(duplict)>1) {
				System.out.println(duplict + " : " + wordcount.get(duplict));
			}
		}

		
	}

	public static void main(String[] args) {
		
		String a = "hi am java and java is best language is good best";
	
		COUNTduplicateCHARACTERstrig( a);
	}
}
