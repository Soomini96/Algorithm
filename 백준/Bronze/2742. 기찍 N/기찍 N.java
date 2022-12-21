import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 2742
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		while (num > 0) {
			System.out.println(num);
			num--;
		}
	}
}