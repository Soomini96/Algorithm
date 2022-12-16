import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = 0;
		for (int k = M; k <= N; k++) {
			int check = 0;
			for (int i = 1; i <= k; i++) {
				if (k % i == 0) {
					check++;
				}
			}
			if (check == 2) {
				sum += k;
				if (min == 0) {
					min = k;
				}
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
}
