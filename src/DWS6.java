import java.util.Scanner;
public class DWS6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		do {
			for (int i=0;i<a;i++) {
				System.out.print("*");
			}
			System.out.print("\n");
			System.out.println("Please enter a number");
			a = sc.nextInt();
		} while (a!=0);
		sc.close();
	}
}