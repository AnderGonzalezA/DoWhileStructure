import java.util.Scanner;
public class DWS5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		do {
			System.out.println("Please enter two numbers");
			a = sc.nextInt();
			b = sc.nextInt();
		} while (a!=123 && a!=321 && b!=123 && b!=321);
		sc.close();
	}
}