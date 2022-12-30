import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 5622
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String call = br.readLine();
		int num[] = new int[call.length()];

		for (int i = 0; i < call.length(); i++) {
			char one = call.charAt(i);
			if ('A' <= one && one <= 'C') {
				num[i] = 2;
			}
			if ('D' <= one && one <= 'F') {
				num[i] = 3;
			}
			if ('G' <= one && one <= 'I') {
				num[i] = 4;
			}
			if ('J' <= one && one <= 'L') {
				num[i] = 5;
			}
			if ('M' <= one && one <= 'O') {
				num[i] = 6;
			}
			if ('P' <= one && one <= 'S') {
				num[i] = 7;
			}
			if ('T' <= one && one <= 'V') {
				num[i] = 8;
			}
			if ('W' <= one && one <= 'Z') {
				num[i] = 9;
			}
		}
		int time = 0;
		for (int i = 0; i < num.length; i++) {
			time += num[i];
			time += 1;
		}
		System.out.println(time);
	}
}