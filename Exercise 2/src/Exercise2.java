import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	printName(); 
	printSum();
	printDivide();
	printMath();
	printProduct();
	printCalculate();
	printMultiple();
	printPattern();
	printExpression();
	printExpression2();
	}
	
	public static void printName() {
		Scanner input = new Scanner (System.in);
		System.out.print ("Please Insert Your First Name: ");
		String FirstName = input.next();
		System.out.print ("Please Insert Your Last Name : " );
		String LastName = input.next();
		System.out.println ("Hello, \n" + FirstName + "\s" + LastName);
	}
	
	public static void printSum() {
		Scanner input = new Scanner (System.in);
		System.out.print("\n" + "Please Insert the first Number: " + "\s");
		int num1 = input.nextInt();
		System.out.print("Please Insert the second Number: ");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println ("The answer is: " + sum);
	}
	
	public static void printDivide() {
		Scanner input = new Scanner (System.in);
		System.out.print("\n" + "Please insert the first number: " + "\s");
		int num1 = input.nextInt();
		System.out.print("Please insert the second number: ");
		int num2 = input.nextInt();
		int divide = num1 / num2;
		System.out.println("The division of first and second number is: " + divide);
	}
	
	public static void printMath() {
		int Q1 = -5 + 8 * 6 ;
		int Q2 = (55+9) % 9 ;
		int Q3 = 20 + -3*5/8 ; 
		int Q4 = 5 + 15 / 3*2 - 8%3 ;
		System.out.println("\n" + "The answer for questions above are: " + "\n\t1. " + Q1 + "\n\t2. " + Q2 + "\n\t3. " + Q3 + "\n\t4. " + Q4);	
	}

	public static void printProduct() {
		Scanner input = new Scanner(System.in);
		System.out.print("\n" + "Please insert the first number: " + "\s");
		int num1 = input.nextInt();
		System.out.print("Please insert the second number: ");
		int num2 = input.nextInt();
		int product = num1 * num2;
		System.out.println("The product of first and second number is: " + product);	
	}
	
	public static void printCalculate() {
		Scanner input = new Scanner(System.in);
		System.out.print("\n" + "Please insert the first digit: ");
		int num1 = input.nextInt();
		System.out.print("Please insert the second digit: ");
		int num2 = input.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		System.out.println(num1 + "mod" + num2 + "=" + (num1%num2));
	}
	
	public static void printMultiple() {
		Scanner input = new Scanner(System.in);
		System.out.print("\n" + "Please enter a digit: ");
		int num = input.nextInt();
		for (int i = 1; i <= 10; i++) {
		  System.out.println(num + "x" + i + "=" + (num*i));	
		}
	}	
	
	public static void printPattern() {
		System.out.println("   J   a   v     v  a ");
		System.out.println("   J  a a   v   v  a a");
		System.out.println("J  J aaaaa   v v  aaaaa");
		System.out.println(" JJ a     a   v  a     a");	
	}
	
	public static void printExpression() {
		System.out.println((30 * 10 - 5 * 3) / (55 - 30));
	}
	
	public static void printExpression2() {
		double pi = 6.0 * (2 - (4.0/8) + (2/5) - (3/6) + (4/25) - (2/10));
		System.out.println(pi);
	}
	
}
