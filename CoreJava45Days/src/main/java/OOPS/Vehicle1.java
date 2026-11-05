package OOPS;

public abstract class Vehicle1 {

	public abstract void startEngine(); //Abstract method don't specify method body
	
	public static String fuelType() {
		System.out.println("Vehicle model name:"+Vehicle1.ModelName());
		return "diesel";
	}
	
	public Vehicle1() {
		System.out.println("Constructor from Vehicle class");
	}
	
  public static final String ModelName() {
		
		return "Fortuner" ;
	}
	
	
}
