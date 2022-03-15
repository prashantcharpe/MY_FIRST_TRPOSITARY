package naveen;

public class RemovecharacterfromSTRING {
	
public static void main(String[] args) {
	

	String a= "@#$#@$$%$%RFWFW864485";
	
	a=a.replaceAll("[^a-zA-Z0-9]","");
	
	System.out.println(a);
	
	
	String b = "387474ihghrg843454#$%&**";
	
	b =b.replaceAll("[^a-zA-z0-9]", "");
	System.out.println(b);
}	
}
