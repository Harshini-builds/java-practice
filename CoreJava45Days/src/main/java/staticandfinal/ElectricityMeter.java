package staticandfinal;

public class ElectricityMeter {
	String meter_no;
	String owner_name;
	float units_consumed;
	static double electricity_rate=8;
	public ElectricityMeter(String meter_no, String owner_name, float units_consumed) {
		super();
		this.meter_no = meter_no;
		this.owner_name = owner_name;
		this.units_consumed = units_consumed;
	}

	public void electricity_Bill() {
		double bill=electricity_rate*units_consumed;
		System.out.println("--------------------- Electricity Bill ----------------------");
		System.out.println("Owner Name :"+owner_name);
		System.out.println("Meter_No :"+meter_no);
		System.out.println("No_Of_Units_Consumed :"+units_consumed);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Total Electricity Bill :"+bill);
		System.out.println("--------------------------------------------------------------");
	}
	public static void main(String[] args) {
	ElectricityMeter e1=new  ElectricityMeter("17893673", "Harshini",300.50f);
	ElectricityMeter e2=new ElectricityMeter("392091239", "TTD",1500.75f);
	System.out.println("Bills before Units charges Increased ");
	e1.electricity_Bill();
	e2.electricity_Bill();
	System.out.println("Bills After Units charges Increased ");
	ElectricityMeter.electricity_rate=11;//we can directly call with variable name without using class name inside static area
	e1.electricity_Bill();
	e2.electricity_Bill();
	
	}
}