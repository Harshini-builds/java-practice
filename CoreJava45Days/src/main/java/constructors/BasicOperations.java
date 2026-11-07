package constructors;

public class BasicOperations {

	static {
		System.out.println("Static Block executed ");//executes only once when class loaded before main method
	}
	{
	System.out.println("Instance Block Executed");// it got executed before the constructor if there is no object created in class it wont called
	}
	public BasicOperations() {
		System.out.println("Constructor Called");//calls automatically at the time of object creation
	}
	
	public static void main(String[] args) {
    BasicOperations b1=	new BasicOperations();
	BasicOperations b2=new BasicOperations();
	}

}
