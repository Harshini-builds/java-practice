package constructors;

/*
 * Program:Program to perform constructor overloading
 */
public class ConstructorOverloading {

	int a;
	int b;
	int c;
	int d;
public ConstructorOverloading(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("Addition with two values  :"+(a+b));
}
public ConstructorOverloading(int a,int b,int c) {
	this.a=a;
	this.b=b;
	this.c=c;
	System.out.println("Addition of Three values :"+(a+b+c));
}
public ConstructorOverloading(int a,int b,int c,int d) {
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
	System.out.println("Multiplication of all four variable :"+(a*b*c*d));
}
	public static void main(String[] args) {
	new ConstructorOverloading(20, 5);
	new ConstructorOverloading(3, 9, 27);
	new ConstructorOverloading(2, 4, 6, 8);

	}

}
