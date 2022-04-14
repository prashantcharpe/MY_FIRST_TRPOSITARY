package susharsir;

public class duplicatecharacter {
	public static void main(String[] args) {
		
		String p="pushpa pushparaj";
		String s =p.replace(" ", "");
		int count;
		
		char String []= s.toCharArray();// this is use for string convert to char
		                                // like m y n a m e 
		System.out.println("length " + String.length);
		System.out.print(" Duplicate character in a string:");
		
		for( int i =0; i<String.length; i++) {
			count=1;
			boolean flag =false;
			for(int j=i+1; j<String.length; j++) {
				if(String[i]==String[j] && String [i]!=' '){
						String[j]='0';// 0 replace cuplicate character like my na0e
						count++;   
						flag=true;//boz netx time this m is not count
				}		              
			}
			if (flag && String[i]!='0') {
				System.out.println (String[i]+ " : " + count);
			}
		}
	}
}
