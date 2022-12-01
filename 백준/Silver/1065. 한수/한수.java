import java.util.Scanner;

public class Main { // 1065
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(); // 1~1000
		int cnt = 0;

		if (num < 100) {
			cnt = num;
		} else { // 100~1000
			if (num == 1000) {
				num = 999;
			}
			cnt = 99;
			for (int i = 100; i <= num; i++) {
				int one = i % 10;
				int ten = (i / 10) % 10;
				int hun = i / 100;

				if ((ten - one) == (hun - ten)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}