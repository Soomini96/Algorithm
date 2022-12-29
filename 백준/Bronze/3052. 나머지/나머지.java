import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 3052
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int remainders[] = null;
		final int x = 42;

		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			int remainder = num % x;
			if (remainders == null) {
				remainders = new int[1];
				remainders[0] = remainder;
			} else {
				int idx = -1;
				for (int j = 0; j < remainders.length; j++) {
					if (remainder == remainders[j]) {
						idx = j;
					}
				}
				if (idx == -1) { // 같은게 없을때 -> 새로 만들기
					int n = remainders.length;
					int temp[] = remainders;
					remainders = new int[n + 1];
					for (int j = 0; j < temp.length; j++) {
						remainders[j] = temp[j];
					}
					remainders[n] = remainder;
				}
			}
		}
		System.out.println(remainders.length);
	}
}