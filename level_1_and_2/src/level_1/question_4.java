package level_1;

public class question_4 {
	public static void main(String[] args) {
		double cp = 129;
		double sp = 191;
		System.out.println("the cost price is INR "+(cp)+ " and selling price INR "+sp);
		
		double profit = sp - cp;
		double profit_percentage = (profit/cp)*100;
		System.out.println("the profit is INR " +(profit)+ " and the profit percentage is INR "+(profit_percentage)+"%");
	}
}
