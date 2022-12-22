import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 2908
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();
		String nums[] = num.split(" ");

		int result[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			String temp = "";
			for (int j = nums[i].length() - 1; j >= 0; j--) {
				temp += nums[i].charAt(j);
			}
			result[i] = Integer.valueOf(temp);
		}

		// max
		int max = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] > max) {
				max = result[i];
			}
		}
		System.out.println(max);

	}
}