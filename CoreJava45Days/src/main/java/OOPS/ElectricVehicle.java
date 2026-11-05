package OOPS;

public interface ElectricVehicle {

	int powerBackupCapacity=24;   // every variable in interface by default consider as public static final (which is constant)
	
	public abstract String chargeType();
	
	public static String Model() {
		return "EV vehicle ";
	}
	public static String VehicleName() {
		return "NEXA";
	}
	default int Price() { // we do not write default access modifier with default keyword but in interface if we want to declare a method 
	                    	//as default we have to mention the default access modifier
		return 100000;
	}
}
