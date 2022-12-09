import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { // 2438
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int idx = 1; idx <= t; idx++) {
			for (int i = 0; i < idx; i++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		br.close();
		bw.close();
	}
}
