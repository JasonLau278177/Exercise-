package Exercise3;

public class SumAverageRunningInt {

	public static void main(String[] args) {

	System.out.println("For Loop");
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number<=upperbound; number++) {
			sum = sum + number;
		}
		double sum2 =sum;
		average = sum2/upperbound;
		
				System.out.println("The sum of 1 to 100 is "+sum2);
				System.out.println("The average is " + average );
	
	printWhileDoLoop();
	printDoWhileLoop();
	}
	public static void printWhileDoLoop(){
		System.out.println("\n" + "WhileDoLoop");
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
	
		int num = lowerbound;
		while (num <= upperbound) {
			sum = sum+num; 
			num++;
		}
		double sum2 = sum;
		average = sum2/upperbound;
		
		System.out.println("The sum of 1 to 100 is "+sum2);
		System.out.println("The average is " + average );
	}	
	
	public static void printDoWhileLoop() {
		System.out.println("\n" + "WhileDoLoop");
		int sum = 0;
		int lowerbound = 1;
		int upperbound = 100;
		
		do {
			sum = sum + lowerbound;
			lowerbound++;
		}
		while (lowerbound<=upperbound);
		
		double sum2 = sum;
		double average = (sum2/upperbound);
		
		System.out.println("The sum of 1 to 100 is "+sum2);
		System.out.println("The average is " + average );
	}
}
