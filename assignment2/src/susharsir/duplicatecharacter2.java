package susharsir;

public class duplicatecharacter2 {
	

	public static void main(String[] args) {
		
		String s="my name is prashant";
	
		int length = s.length();
		
		char cha[] = s.toCharArray();
		
		for ( int i=0; i<length; i++) {
			for( int j=i+1; j<length; j++) {
				
				if(cha[i]==cha[j]) {
					System.out.println(" Duplicate characters are :" + cha[j]);
				break;
				
			}
			}
		}
	}
}



