import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int bee = sc.nextInt();
		int sum = 1;
		int n = 1;
		while (bee > sum) {
			sum += 6 * n;
			n++;
		}
		System.out.println(n);
	}

}