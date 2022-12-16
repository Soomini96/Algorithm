import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 2577
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int answer = A * B * C;
		String str = String.valueOf(answer);

		int cnt[] = new int[10];

		for (int i = 0; i <= 9; i++) { // i-> 기준이 되는 숫자
			for (int j = 0; j < str.length(); j++) { // i와 같은 숫자 있나 확인
				String temp = "";
				temp += str.charAt(j);
				if (Integer.parseInt(temp) == i) {
					cnt[i] += 1;
				}
			}
		}
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}