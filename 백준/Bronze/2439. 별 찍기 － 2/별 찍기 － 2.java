import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { // 2438
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine()); // 5

		for (int idx = t; idx > 0; idx--) { // 5 4 3 2 1

			for (int i = idx - 1; i > 0; i--) { // 4321 / 321 / 21 / 1 / 0
				bw.write(" ");
			}
			for (int j = t - idx; j >= 0; j--) { // 1 2 3 4
				bw.write("*");
			}
			bw.write("\n");
		}
		br.close();
		bw.close();
	}
}