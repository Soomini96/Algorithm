import java.util.Scanner;

public class Main { // 2675
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int repeat = sc.nextInt();
			String txt = sc.next();
			String result = "";
			for (int j = 0; j < txt.length(); j++) {

				for (int k = 0; k < repeat; k++) {
					result += String.valueOf(txt.charAt(j));
				}
			}
			System.out.println(result);
		}
	}
}