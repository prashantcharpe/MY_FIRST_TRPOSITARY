package susharsir;

public class duplicatecharacter {

	public static void main(String[] args) {
		
		String s="pushpa pushparaj";
		int count;
		
		char String []= s.toCharArray();// this is use for string convert to char
		                                // like m y n a m e 
		System.out.println("length " + String.length);
		System.out.print(" Duplicate character in a string:");
		
		for( int i =0; i<String.length; i++) {
			count=1;
			for(int j=i+1; j<String.length; j++) {
				if(String[i]==String[j] && String [i]!=' '){
						count++;
						String[j]='0';// 0 replace cuplicate character like my na0e
				}		              //boz netx time this m is not count
			}
			if (count>1 && String[i]!='0') {
				System.out.print(String[i]);
			}
		}
	}
}
