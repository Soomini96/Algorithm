import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 2884
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String temp[] = input.split(" ");
		int hour = Integer.parseInt(temp[0]);
		int min = Integer.parseInt(temp[1]);
		
		final int alarm = 45;
		
		if (min - alarm >= 0) {
			min = min - alarm;
		} else if (min - alarm < 0) {
			if (hour == 0) {
				hour = 23;
				min = min + 60 - alarm;
			} else {
				hour--;
				min = min + 60 - alarm;
			}
		}
		System.out.println(hour + " " + min);
	}
}
