package pravinpractice2;

public class vowel {

	public static void vowel(char a) {
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
			System.out.println(" this is vowel : " + a);
		}else {
			System.out.println(" this is not vowel : " + a);
		}
	}
	
	public static void main(String[] args) {
		vowel('4');
		vowel('a');
		vowel('z');
	}
}
