import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;

		int n = 0;
		while (num > sum) {
			n++;
			sum += n;
		}

		int over = sum - num;
		if (n % 2 == 0) {
			System.out.print((n - over) + "/" + (1 + over));
		} else if (n % 2 == 1) {
			System.out.println((1 + over) + "/" + (n - over));
		}
	}
}