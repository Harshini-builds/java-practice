package operators;

public class UnaryOperators {
public void operations1() {
	int a=10;
	System.out.println("==================================");
	System.out.println("Unary Operators");
	System.out.println("==================================");
	System.out.println("Pre Increment:"+(++a));//11
	System.out.println("a value :"+a);  //11
	System.out.println("----------------------------------");
	System.out.println("Post Increment:"+(a++));//11
	System.out.println("a value :"+a);//12
	System.out.println("----------------------------------");
	System.out.println("Pre Decrement:"+(--a));//11
	System.out.println("a value :"+a);//11
	System.out.println("----------------------------------");
	System.out.println("Post Decrement:"+(a--));//11
	System.out.println("a value :"+a);//10
	
}
public void operations2() {
	int x=20;
	
	int y= ++x+x++;//21+21
	System.out.println("__________________________________");
	System.out.println("x value :"+x);
	System.out.println("y value :"+y);
}
	public static void main(String[] args) {
		UnaryOperators unaryoperators=new UnaryOperators();
		unaryoperators.operations1();
		unaryoperators.operations2();
	}

}
