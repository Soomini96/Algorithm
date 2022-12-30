import java.util.Scanner;

public class Main { // 4673
	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			boolean check = false;
			for (int j = 1; j < i; j++) {
				int num = j;
				int sum = j;
				while (num > 0) { // j = 123 -> 12 / 3
					sum += num % 10;
					num = num / 10;
					if (num == 0) {
						break;
					}
				}
				if (sum == i) {
					check = true;
				}
			}
			if (!check) {
				System.out.println(i);
			}
		}
	}
}