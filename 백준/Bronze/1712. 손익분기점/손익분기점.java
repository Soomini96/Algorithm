import java.util.Scanner;

public class Main { // 1712

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int fix = sc.nextInt();
		int var = sc.nextInt();
		int price = sc.nextInt();

		if (var >= price) {
			System.out.println(-1);
		} else {
			System.out.println(fix / (price - var) + 1);

		}
	}
}