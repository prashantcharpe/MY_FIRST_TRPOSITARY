package susharsir;

public class duplicatecharacter2 {
	

	public static void main(String[] args) {
		
		String b="my name is prashant";
		String s =b.replace(" ", "");
	int count =0;
		int length = s.length();
		
		char cha[] = s.toCharArray();
		
		for ( int i=0; i<length; i++) {
			for( int j=i+1; j<length; j++) {
				
				if(cha[i]==cha[j]) {
					count++;
					System.out.println(" Duplicate characters are :" + cha[j]);
			} 
			}
		}
	}
}



