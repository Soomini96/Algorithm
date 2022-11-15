import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int move = 0;
			int xGo = 0;
			int yGo = 0;

			while (true) {
				move++;
				x += move;
				xGo++;

				if (x >= y)
					break;

				y -= move;
				yGo++;

				if (x >= y)
					break;
			}
			System.out.println(xGo + yGo);
		}
	}
}