import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int check = 0;
			for (int k = 1; k <= num; k++) {
				if (num % k == 0) {
					check++;
				}
			}
			if (check == 2) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}