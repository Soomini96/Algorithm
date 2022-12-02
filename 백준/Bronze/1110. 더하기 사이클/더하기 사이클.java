import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 1110
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int FIRST = num;
		int n = 0;
		while (true) {
			int ten = 0;
			// 10 넘을때
			if (num >= 10) {
				ten = num / 10;
			}
			int one = num % 10;

			int answer = ten + one;

			if (answer >= 10) {
				answer = answer % 10;
			}

			// int->String
			String newTen = String.valueOf(one);
			String newOne = String.valueOf(answer);

			String temp = newTen + newOne;
			num = Integer.parseInt(temp);
			n++;
			if (FIRST == num) {
				System.out.println(n);
				break;
			}
		}
	}
}