import java.util.Scanner;
public class Exercise1 {


	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	printname();
	printage();
	printgender();
	printgrade();
	printGPA();
	printwork();
	printtalent();

	}
	
	public static void printname() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		String name = input.next();
		System.out.println("Name: "+ name); 
	}
	
	public static void printage() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		System.out.println("age: "+age);
	}
	
	public static void printgender() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your gender: ");
		String gender = input.next();
		System.out.println("Gender: " + gender);
	}	
	
	public static void printgrade() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your grade STIA1113: ");
		String grade = input.next();
		System.out.println("Grade " + grade); 
	}
	
	public static void printGPA() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your GPA semester 1: ");
		double num1 = input.nextDouble();
		System.out.print("Enter your GPA semester 2: ");
		double num2 = input.nextDouble();
	
		double sum = num1+num2;
		double totalgpa = sum/2;
		System.out.println("CGPA for current sem is "+totalgpa);
	}
	
	public static void printwork() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your working experience: ");
		String work = input.next();
		System.out.println("Working Experience: " + work);
	}
	
	public static void printtalent() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your 3 talent: ");
		String talent = input.next();
		String talent2 = input.next();
		String talent3 = input.next();
		System.out.println("Talent: " + talent + "\n\t" + talent2 + "\n\t" + talent3);
		input.close();
	}
	
}