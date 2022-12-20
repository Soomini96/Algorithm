import java.util.Scanner;

public class Main { // 2588
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		// String 으로 전환!
		String str = String.valueOf(b);
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			char temp = str.charAt(i); // 한단어만 빼기
			String temptemp = ""; // char -> String
			temptemp += temp;
			int num = Integer.parseInt(temptemp); // String -> int
			System.out.println(a * num);
		}
		System.out.println(a * b);
	}
}