import java.util.Scanner;
public class Quizz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please insert your inches\s\s: ");
		int inches = input.nextInt();
		System.out.print("Please insert your feet\t\s\s\s: ");
		int feet = input.nextInt();
		System.out.println("For Male, ideal weight is\s\s: " + (50+6*feet) + "kg");
		System.out.println("For Female, ideal weight is: " + (40+5*feet) + "kg");
		input.close();
	}

}
