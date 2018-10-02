import java.util.Scanner;
public class DWS4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		do {
			int b = a*a;
			System.out.println(a + "*" + a + "=" + b);
			System.out.println("Please enter a number");
			a = sc.nextInt();
		} while (a!=0);
		sc.close();
	}
}