package Exception;

public class ThrowExample2 {

	public static void main(String[] args) {

		ThrowExample2 m = new ThrowExample2();
		m.gmail("prashant", ""); 

	}

	public void gmail(String username, String password) {
		try {
		if (password.isEmpty()) {
			
			throw new NullPointerException();
		}
		}
		catch (NullPointerException p) {
			System.out.println(" please enter valid credential");
		}
		
	}
}

