package level_1;
import java.util.Scanner;
public class question_8 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the student fee (INR): ");
	    double fee = input.nextDouble();
	    System.out.println("Enter the university discount percentage: ");
	    double discountPercent = input.nextDouble();
	    double discountAmount = (fee * discountPercent) / 100;
	    double finalFee = fee - discountAmount;
	    System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
	    input.close();
    }
}
