import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 8393
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
