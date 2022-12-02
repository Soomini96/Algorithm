import java.util.Scanner;

public class Main { // 1157
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 저장하기
		final int ALPHA = 26;
		int lower[] = new int[ALPHA];
		int upper[] = new int[ALPHA];

		int idx = 0;
		for (int i = (int) 'a'; i <= (int) 'z'; i++) {
			lower[idx] = i;
			idx++;
		}
		idx = 0;
		for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
			upper[idx] = i;
			idx++;
		}

		// 입력받기
		String txt = sc.next();
		int result[] = new int[ALPHA];

		for (int i = 0; i < txt.length(); i++) {
			int word = (int) txt.charAt(i);
			for (int j = 0; j < ALPHA; j++) {
				if (word == lower[j] || word == upper[j]) {
					result[j]++;
				}
			}
		}

		// 가장 많이 쓰인 알파벳 구하기
		int max = 0;
		idx = 0;
		for (int i = 0; i < ALPHA; i++) {
			if (result[i] > max) {
				max = result[i];
				idx = upper[i];
			}
		}
		// 중복검사
		int cnt = 0;
		for (int i = 0; i < ALPHA; i++) {
			if (result[i] == max) {
				cnt++;
			}
		}
		if (cnt > 1) {
			System.out.println("?");
		} else {
			System.out.println((char) idx);
		}

	}
}
