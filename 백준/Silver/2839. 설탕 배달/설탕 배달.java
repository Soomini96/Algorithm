import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sell = sc.nextInt();
		final int oh = 5;
		final int sam = 3;

		int cnt = 0;

		while (sell - sam >= 0) {
			if (sell % oh == 0) {
				while (sell - oh >= 0) {
					sell -= oh;
					cnt++;
				}
			} else {
				sell -= sam;
				cnt++;
			}
		}

		if (sell == 0) {
			System.out.println(cnt);
		} else {
			System.out.println(-1);
		}
	}
}