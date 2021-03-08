
public class DebugTest {
	public static void main(String[] args) {
		System.out.println("Start");
		int a =10;
		a= ++a + a++ - a++ + ++a+ a++;
		if(a>55) {
			System.out.println("VALID");
			
		}else {
			System.out.println("NOT VALID");
			
		}
		System.out.println("DONE");
	}

}
