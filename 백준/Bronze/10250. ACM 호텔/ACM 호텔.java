import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			int room[][] = new int[W][H];
			int y = 0;
			int x = 0;
			for (int j = 0; j < room.length; j++) {
				for (int k = 0; k < room[j].length; k++) {
					room[j][k] = 1;
					N--;
					if (N == 0) {
						y = j + 1;
						x = (k + 1) * 100;
						break;
					}
				}
				if (N == 0) {
					break;
				}

			}
			System.out.println(x + y);
		}
	}
}