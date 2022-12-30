import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 8958
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int j = 0; j < n; j++) {
			String quiz = br.readLine();

			int scores = 0;
			int score = 0;
			for (int i = 0; i < quiz.length(); i++) {
				String ox = "";
				ox += quiz.charAt(i);
				if (ox.equals("O")) {
					score++;
				}
				if (ox.equals("X")) {
					score = 0;
				}
				scores += score;
			}
			System.out.println(scores);
		}
	}
}