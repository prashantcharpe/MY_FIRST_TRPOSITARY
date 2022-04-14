package pravinprcice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountduplicateSTRING {
	
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

        //extracting all the keys of map- wordcount
		//keyset return set of  key , return type is set
		Set<String> wordsinstring = wordcount.keySet();
		
		for(String duplict : wordsinstring ) {
			if(wordcount.get(duplict)>1) {
				System.out.println(duplict + " : " + wordcount.get(duplict));
			}
		}

	}

	public static void main(String[] args) {
		String a = "hi am java and java is best language is good best";
		duplicateword(a);
	}

}
