package conditionalstatements;
/*
 * Program :WAP to determine whether a business made a Profit, Loss, or No Profit No Loss
 */
import java.util.Scanner;
public class ProfitOrLoss {
	Scanner scan=new Scanner(System.in);
public void toFindProfitOrLoss() {
	System.out.println("Enter Cost Price");
	double cost=scan.nextDouble();
	System.out.println("Enter Selling Price");
	double selling=scan.nextDouble();
	System.out.println("============================");
	System.out.println("Profit Or Loss");
	System.out.println("============================");
	if(cost>0&&selling>0) {
	if(selling>cost)
		System.out.println("Profit");
	else if(selling<cost)
		System.out.println("Loss");
	else 
		System.out.println("No Profit No Loss");
	}
	else {
		System.out.println("Invalid CostPrice or SellingPrice ! Please Check and re-enter again");
	}
	scan.close();
}
	public static void main(String[] args) {
		ProfitOrLoss profitorloss=new ProfitOrLoss();
		profitorloss.toFindProfitOrLoss();
	}

}
