package staticandfinal;

public class MobileDetails {

	
	final String IMEI_Number="111893444785390284392093";
	String brand;
	String mobile_version;
	
	public MobileDetails(String brand, String mobile_version) {
		super();
		this.brand = brand;
		this.mobile_version = mobile_version;
	}
 public void displayDetails() {
	 System.out.println("Brand Name :"+brand);
	 System.out.println("Mobile Verison :"+mobile_version);
	 System.out.println("IMEI Number :"+IMEI_Number);
 }
	public static void main(String[] args) {
	MobileDetails m1=new MobileDetails("Samsung Galaxy ", "Fe70 5G ");
	m1.displayDetails();
//	IMEI_Number="9093847264939103828";
	}

}
