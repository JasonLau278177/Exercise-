
public class Exercise {

	public static void main(String[] args) {
		// 1.
		System.out.println("1.");
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}while(a<=5);

		//2.
		System.out.println("\n2.");
		int total = 25;
		int number = 1;
		while (number<=(total/2)) {
			total = total - number;
			System.out.println(total + " " + number);
			number++;
		}
		System.out.println();
	
		//3.
		System.out.println("\n3.");
		int x = 1;
		while(x<=2) {	
				int y = 1;
				while(y<=3) {		
						int z = 1;
						while(z<=4) {
							System.out.print("*");
							z++;
						}
						System.out.print("!");
						y++;
				}
				System.out.println();
				x++;
			}
		System.out.println();
		
		//4.
		System.out.println("\n4.");
		int num = 4;
		int count = 1;
			while (count<=num) {
				System.out.println(num);
				num = num/2;
				count++;
			}
	}	
}