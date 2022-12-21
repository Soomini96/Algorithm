import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int k = sc.nextInt() + 1;
			int n = sc.nextInt();

			int room[][] = new int[k][n];

			for (int p = 0; p < room.length; p++) {
				for (int q = 0; q < room[p].length; q++) {
					if (p == 0) {
						room[p][q] = q + 1;
					} else if (q == 0) {
						room[p][q] = 1;
					} else {
						room[p][q] = room[p][q - 1] + room[p - 1][q];
					}
				}
			}

//			// print
//			for (int p = 0; p < room.length; p++) {
//				for (int q = 0; q < room[p].length; q++) {
//					System.out.print(room[p][q] + " ");
//				}
//				System.out.println();
//			}
			System.out.println(room[room.length - 1][room[0].length - 1]);
		}
	}
}
